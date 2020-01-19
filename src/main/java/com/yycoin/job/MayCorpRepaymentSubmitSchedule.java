package com.yycoin.job;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.yycoin.pojo.maycur.MayCurAuthInfo;
import com.yycoin.pojo.maycur.MayCurResultData;
import com.yycoin.service.IMayCurCorpRepaymentDetailService;
import com.yycoin.service.IMayCurCorpRepaymentSubmitService;
import com.yycoin.util.BaseContants;
import com.yycoin.util.DateUtils;
import com.yycoin.util.MayCurConfigProperties;
import com.yycoin.util.MayCurUtils;
import com.yycoin.vo.MayCurCorpRepaymentDetailRootExample;
import com.yycoin.vo.MayCurCorpRepaymentDetailRootWithBLOBs;
import com.yycoin.vo.MayCurCorpRepaymentSubmit;
import com.yycoin.vo.MayCurCorpRepaymentSubmitExample;

/**
 * 每刻获取已提交对公收款单据详情
 * 
 * @author Administrator
 *
 */

@Component
public class MayCorpRepaymentSubmitSchedule implements Job, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(MayCorpRepaymentSubmitSchedule.class);

	@Autowired
	private MayCurUtils mayCurUtils;

	@Autowired
	private MayCurConfigProperties mayCurConfigProperties;

	@Autowired
	private IMayCurCorpRepaymentSubmitService mayCurCorpRepaymentSubmitService;

	@Autowired
	private IMayCurCorpRepaymentDetailService mayCurCorpRepaymentDetailService;

	@Autowired
	private DefaultMQProducer mqProducer;

	@SuppressWarnings("rawtypes")
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {

		MayCurResultData<MayCurAuthInfo> loginResult = mayCurUtils.loginMayCurOpenAPI();

		logger.info(loginResult.toString());

		String code = loginResult.getCode();

		logger.info("auth login code:" + code);
		if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(code)) {
			String entCode = loginResult.getData().getEntCode();
			String tokenId = loginResult.getData().getTokenId();
			long timestamp = loginResult.getData().getTimestamp();
			Map<String, String> header = new HashMap<String, String>();
			header.put("entCode", entCode);
			header.put("tokenId", tokenId);
			String submitUrlPath = mayCurConfigProperties.getHost() + mayCurConfigProperties.getCorprepaymentsubmit();

			String firstDay = DateUtils.getCurrMonthFirstDay();
			String lastDay = DateUtils.getCurrMonthLastDay();
			// 月底日期要+1
			lastDay = DateUtils.getDateStringByMargin(lastDay, 1);
			// 拼接url请求参数
			StringBuilder builder = new StringBuilder();
			builder.append(submitUrlPath);
			builder.append("?");
			builder.append("start=");
			builder.append(firstDay);
			builder.append("&end=");
			builder.append(lastDay);
			builder.append("&exportStatus=EMPTY");
			builder.append("&status=complete");
			builder.append("&offset=0");
			builder.append("&limit=500");

			logger.info("start query corp repayment submit:" + builder.toString());

			MayCurResultData resultData = new MayCurResultData();
			try {
				resultData = mayCurUtils.synchronizeToMaycur(header, timestamp, builder.toString(), "GET",
						"application/json", "UTF-8", null);
			} catch (Exception e) {
				e.printStackTrace();
			}
			String resultCode = resultData.getCode();
			if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(resultCode)) {
				String resultDataString = resultData.getData().toString();
				logger.info(resultDataString);
				List<MayCurCorpRepaymentSubmit> respList = JSONObject.parseArray(resultDataString,
						MayCurCorpRepaymentSubmit.class);

				String currDateTime = DateUtils.getCurrDateTime();
				for (MayCurCorpRepaymentSubmit record : respList) {
					try {
						// 防止重复数据，先查询存不存在数据
						MayCurCorpRepaymentSubmitExample countExample = new MayCurCorpRepaymentSubmitExample();
						countExample.createCriteria().andReportIdEqualTo(record.getReportId());
						int exists = mayCurCorpRepaymentSubmitService.countByExample(countExample);
						if (exists == 0) {
							record.setExportflag(0);
							record.setCreateflag(0);
							record.setPaymentstatus(0);
							record.setSavetime(currDateTime);
							mayCurCorpRepaymentSubmitService.insert(record);
						}
					} catch (Exception e) {
						e.printStackTrace();
						logger.error("corp repayment submit error", e);
						continue;
					}
				}

				String detailUrlPath = mayCurConfigProperties.getHost()
						+ mayCurConfigProperties.getCorprepaymentdetail();
				// 写入之后，获取已提交对私报销单据详情
				for (MayCurCorpRepaymentSubmit record : respList) {
					// 防止重复数据，先查询存不存在数据
					MayCurCorpRepaymentDetailRootExample detailCountExample = new MayCurCorpRepaymentDetailRootExample();
					detailCountExample.createCriteria().andReportIdEqualTo(record.getReportId());
					int existsDetail = mayCurCorpRepaymentDetailService.countByExample(detailCountExample);
					if (existsDetail > 0) {
						continue;
					}
					String businessCode = record.getReportId();
					// 拼接url请求参数
					StringBuilder detailBuilder = new StringBuilder();
					detailBuilder.append(detailUrlPath);
					detailBuilder.append("?");
					detailBuilder.append("businessCode=");
					detailBuilder.append(businessCode);

					logger.info("start query corp repayment submit detail:" + detailBuilder.toString());

					MayCurResultData resultDetailData = new MayCurResultData();
					try {
						resultDetailData = mayCurUtils.synchronizeToMaycur(header, timestamp, detailBuilder.toString(),
								"GET", "application/json", "UTF-8", null);
						String resultDetailCode = resultDetailData.getCode();
						if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(resultDetailCode)) {
							String resultDetailDataString = resultDetailData.getData().toString();
							logger.info("corp repayment submit detail reportid:" + businessCode + ";data is:"
									+ resultDetailDataString);
							List<MayCurCorpRepaymentDetailRootWithBLOBs> respDetailList = JSONObject
									.parseArray(resultDetailDataString, MayCurCorpRepaymentDetailRootWithBLOBs.class);
							for (MayCurCorpRepaymentDetailRootWithBLOBs recordDetail : respDetailList) {
								recordDetail.setSavetime(DateUtils.getCurrDateTime());
								mayCurCorpRepaymentDetailService.insert(recordDetail);
							}
						}

					} catch (Exception e) {
						logger.error("corp repayment detail error", e);
						continue;
					}

				}
			}

		}

		// 消息队列生成oa单据

//		MayCurCorpSubmitExample submitExample = new MayCurCorpSubmitExample();
//		submitExample.createCriteria().andCreateflagEqualTo(0).andStatusEqualTo("SETTLEMENT");
//		List<MayCurCorpSubmit> submitList = mayCurCorpSubmitService.selectByExample(submitExample);
//		if (submitList.size() == 0) {
//			return;
//		}
//
//		// 进入消息队列
//		for (MayCurCorpSubmit submit : submitList) {
//			// notify rocketmq to do oa data,use ConsumerTag
//			Message sendMsg = new Message("MayCurTopic", "ConsumerTag", submit.getReportId().getBytes());
//			try {
//				SendResult sendResult = mqProducer.send(sendMsg);
//				logger.info("消息发送响应信息：" + sendResult.toString());
//			} catch (Exception e) {
//				logger.error("do consume mq error", e);
//				e.printStackTrace();
//			}
//		}

	}

}
