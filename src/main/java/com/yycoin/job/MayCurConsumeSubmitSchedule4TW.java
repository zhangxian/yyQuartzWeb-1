package com.yycoin.job;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.yycoin.multipleds.YYDataSource;
import com.yycoin.pojo.maycur.MayCurAuthInfo;
import com.yycoin.pojo.maycur.MayCurResultData;
import com.yycoin.service.IMayCurConsumeDetailRootService;
import com.yycoin.service.IMayCurConsumeSubmitService;
import com.yycoin.util.BaseContants;
import com.yycoin.util.DateUtils;
import com.yycoin.util.MayCurConfigProperties;
import com.yycoin.util.MayCurUtils;
import com.yycoin.vo.MayCurConsumeDetailRootExample;
import com.yycoin.vo.MayCurConsumeDetailRootWithBLOBs;
import com.yycoin.vo.MayCurConsumeSubmit;
import com.yycoin.vo.MayCurConsumeSubmitExample;

/**
 * 每刻获取已提交消费申请单据
 * 
 * @author Administrator
 *
 */

@Component
public class MayCurConsumeSubmitSchedule4TW implements Job, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(MayCurConsumeSubmitSchedule4TW.class);

	@Autowired
	private MayCurUtils mayCurUtils;

	@Autowired
	private MayCurConfigProperties mayCurConfigProperties;

	@Autowired
	private IMayCurConsumeSubmitService mayCurConsumeSubmitService;

	@Autowired
	private IMayCurConsumeDetailRootService mayCurConsumeDetailRootService;

	@Autowired
	private DefaultMQProducer mqProducer;

	@Autowired
	private MayCurConsumeSubmitSchedule4TW mayCurConsumeSubmitSchedule4TW;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		mayCurConsumeSubmitSchedule4TW.doo();
	}

	@SuppressWarnings("rawtypes")
	@YYDataSource(name = "tw")
	public void doo() {

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
			String submitUrlPath = mayCurConfigProperties.getHost() + mayCurConfigProperties.getConsumesubmit();

			String firstDay = DateUtils.getCurrMonthFirstDay();
			String lastDay = DateUtils.getCurrMonthLastDay();
			// 月底日期要+1
			lastDay = DateUtils.getDateStringByMargin(lastDay, 1);
			// 拼接url请求参数
			StringBuilder builder = new StringBuilder();
			builder.append(submitUrlPath);
			builder.append("?");
			builder.append("auditedAtStart=");
			builder.append(firstDay);
			builder.append("&auditedAtEnd=");
			builder.append(lastDay);
			builder.append("&exportStatus=EMPTY");
			builder.append("&status=settle");
			builder.append("&offset=0");
			builder.append("&limit=500");

			logger.info("tw start query consume submit:" + builder.toString());

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
				List<MayCurConsumeSubmit> respList = JSONObject.parseArray(resultDataString, MayCurConsumeSubmit.class);

				String currDateTime = DateUtils.getCurrDateTime();
				for (MayCurConsumeSubmit record : respList) {
					String entityCode = record.getSubsidiaryCode();
					if (!ENTITY_CODE_TW.equalsIgnoreCase(entityCode)) {
						continue;
					}
					try {
						// 防止重复数据，先查询存不存在数据
						MayCurConsumeSubmitExample countExample = new MayCurConsumeSubmitExample();
						countExample.createCriteria().andReportIdEqualTo(record.getReportId());
						int exists = mayCurConsumeSubmitService.countByExample(countExample);
						if (exists == 0) {
							record.setExportflag(0);
							record.setCreateflag(0);
							record.setPaymentstatus(0);
							record.setSavetime(currDateTime);
							mayCurConsumeSubmitService.insert(record);
						}
					} catch (Exception e) {
						e.printStackTrace();
						logger.error("tw consume submit error", e);
						continue;
					}
				}

				String detailUrlPath = mayCurConfigProperties.getHost() + mayCurConfigProperties.getConsumedetail();
				// 写入之后，获取已提交对私报销单据详情
				for (MayCurConsumeSubmit record : respList) {
					String entityCode = record.getSubsidiaryCode();
					if (!ENTITY_CODE_TW.equalsIgnoreCase(entityCode)) {
						continue;
					}
					// 防止重复数据，先查询存不存在数据
					MayCurConsumeDetailRootExample detailCountExample = new MayCurConsumeDetailRootExample();
					detailCountExample.createCriteria().andReportIdEqualTo(record.getReportId());
					int existsDetail = mayCurConsumeDetailRootService.countByExample(detailCountExample);
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

					logger.info("tw start query consume submit detail:" + detailBuilder.toString());

					MayCurResultData resultDetailData = new MayCurResultData();
					try {
						resultDetailData = mayCurUtils.synchronizeToMaycur(header, timestamp, detailBuilder.toString(),
								"GET", "application/json", "UTF-8", null);
						String resultDetailCode = resultDetailData.getCode();
						if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(resultDetailCode)) {
							String resultDetailDataString = resultDetailData.getData().toString();
							logger.info("tw consume detail reportid:" + businessCode + ";data is:"
									+ resultDetailDataString);
							List<MayCurConsumeDetailRootWithBLOBs> respDetailList = JSONObject
									.parseArray(resultDetailDataString, MayCurConsumeDetailRootWithBLOBs.class);
							for (MayCurConsumeDetailRootWithBLOBs recordDetail : respDetailList) {
								recordDetail.setSavetime(DateUtils.getCurrDateTime());
								mayCurConsumeDetailRootService.insert(recordDetail);
							}
						}

					} catch (Exception e) {
						logger.error("tw consume detail error", e);
						continue;
					}

				}
			}

		}

		// 消息队列生成oa单据
		MayCurConsumeSubmitExample submitExample = new MayCurConsumeSubmitExample();
		submitExample.createCriteria().andCreateflagEqualTo(0).andStatusEqualTo("SETTLEMENT");
		List<MayCurConsumeSubmit> submitList = mayCurConsumeSubmitService.selectByExample(submitExample);
		if (submitList.size() == 0) {
			return;
		}

		// 进入消息队列
		for (MayCurConsumeSubmit submit : submitList) {
			// notify rocketmq to do oa data,use ConsumerTag
			Message sendMsg = new Message("MayCurTopic", "ConsumerTagTw", submit.getReportId().getBytes());
			try {
				SendResult sendResult = mqProducer.send(sendMsg);
				logger.info("消息发送响应信息：" + sendResult.toString());
			} catch (Exception e) {
				logger.error("do consume mq error", e);
				e.printStackTrace();
			}
		}

	}

}
