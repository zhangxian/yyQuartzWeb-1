package com.yycoin.job;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
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
import com.yycoin.service.IMayCurExpenseDetailRootService;
import com.yycoin.service.IMayCurExpenseSubmitService;
import com.yycoin.util.BaseContants;
import com.yycoin.util.DateUtils;
import com.yycoin.util.MayCurConfigProperties;
import com.yycoin.util.MayCurUtils;
import com.yycoin.vo.MayCurExpenseDetailRootExample;
import com.yycoin.vo.MayCurExpenseDetailRootWithBLOBs;
import com.yycoin.vo.MayCurExpenseSubmit;
import com.yycoin.vo.MayCurExpenseSubmitExample;

/**
 * 每刻获取已提交对私报销单据
 * 
 * @author Administrator
 *
 */

@Component
public class MayCurExpenseSubmitSchedule implements Job, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(MayCurExpenseSubmitSchedule.class);

	@Autowired
	private MayCurUtils mayCurUtils;

	@Autowired
	private MayCurConfigProperties mayCurConfigProperties;

	@Autowired
	private IMayCurExpenseSubmitService mayCurExpenseSubmitService;

	@Autowired
	private IMayCurExpenseDetailRootService mayCurExpenseDetailRootService;

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
			String submitUrlPath = mayCurConfigProperties.getHost() + mayCurConfigProperties.getExpensesubmit();

			String firstDay = DateUtils.getCurrMonthFirstDay();
			String lastDay = DateUtils.getCurrMonthLastDay();
			// 拼接url请求参数
			StringBuilder builder = new StringBuilder();
			builder.append(submitUrlPath);
			builder.append("?");
			builder.append("start=");
			builder.append(firstDay);
			builder.append("&end=");
			builder.append(lastDay);
			builder.append("&exportStatus=EMPTY");
			builder.append("&status=settle");
			builder.append("&offset=0");
			builder.append("&limit=500");

			logger.info("start query expense submit:" + builder.toString());

			MayCurResultData resultData = new MayCurResultData();
			try {
				resultData = mayCurUtils.synchronizeToMaycur(header, timestamp, builder.toString(), "GET",
						"application/json", "UTF-8", null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String resultCode = resultData.getCode();
			if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(resultCode)) {
				String resultDataString = resultData.getData().toString();
				logger.info(resultDataString);
				List<MayCurExpenseSubmit> respList = JSONObject.parseArray(resultDataString, MayCurExpenseSubmit.class);

				String currDateTime = DateUtils.getCurrDateTime();
				for (MayCurExpenseSubmit record : respList) {
					try {
						// 防止重复数据，先查询存不存在数据
						MayCurExpenseSubmitExample countExample = new MayCurExpenseSubmitExample();
						countExample.createCriteria().andReportIdEqualTo(record.getReportId());
						int exists = mayCurExpenseSubmitService.countByExample(countExample);
						if (exists == 0) {
							record.setExportflag(0);
							record.setCreateflag(0);
							record.setPaymentstatus(0);
							record.setSavetime(currDateTime);
							mayCurExpenseSubmitService.insert(record);
						}
					} catch (Exception e) {
						e.printStackTrace();
						logger.error("expense submit error", e);
						continue;
					}
				}

				String detailUrlPath = mayCurConfigProperties.getHost() + mayCurConfigProperties.getExpensedetail();
				// 写入之后，获取已提交对私报销单据详情
				for (MayCurExpenseSubmit record : respList) {
					// 防止重复数据，先查询存不存在数据
					MayCurExpenseDetailRootExample detailCountExample = new MayCurExpenseDetailRootExample();
					detailCountExample.createCriteria().andReportIdEqualTo(record.getReportId());
					int existsDetail = mayCurExpenseDetailRootService.countByExample(detailCountExample);
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

					logger.info("start query expense submit detail:" + detailBuilder.toString());

					MayCurResultData resultDetailData = new MayCurResultData();
					try {
						resultDetailData = mayCurUtils.synchronizeToMaycur(header, timestamp, detailBuilder.toString(),
								"GET", "application/json", "UTF-8", null);
						String resultDetailCode = resultDetailData.getCode();
						if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(resultDetailCode)) {
							String resultDetailDataString = resultDetailData.getData().toString();
							logger.info(
									"expense detail reportid:" + businessCode + ";data is:" + resultDetailDataString);
							List<MayCurExpenseDetailRootWithBLOBs> respDetailList = JSONObject
									.parseArray(resultDetailDataString, MayCurExpenseDetailRootWithBLOBs.class);
							for (MayCurExpenseDetailRootWithBLOBs recordDetail : respDetailList) {
								recordDetail.setSavetime(DateUtils.getCurrDateTime());
								mayCurExpenseDetailRootService.insert(recordDetail);
							}
						}

					} catch (Exception e) {
						logger.error("expense detail error", e);
						continue;
					}

				}
			}

		}

		// 消息队列生成oa单据
		MayCurExpenseSubmitExample submitExample = new MayCurExpenseSubmitExample();
		submitExample.createCriteria().andCreateflagEqualTo(0).andStatusEqualTo("SETTLEMENT");
		List<MayCurExpenseSubmit> submitList = mayCurExpenseSubmitService.selectByExample(submitExample);
		if (submitList.size() == 0) {
			return;
		}

		// 进入消息队列
		for (MayCurExpenseSubmit submit : submitList) {
			// notify rocketmq to do oa data,use ExpenseTag
			Message sendMsg = new Message("MayCurTopic", "ExpenseTag", submit.getReportId().getBytes());
			try {
				SendResult sendResult = mqProducer.send(sendMsg);
				logger.info("消息发送响应信息：" + sendResult.toString());
			} catch (MQClientException e) {
				e.printStackTrace();
			} catch (RemotingException e) {
				e.printStackTrace();
			} catch (MQBrokerException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
