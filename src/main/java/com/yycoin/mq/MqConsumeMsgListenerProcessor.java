package com.yycoin.mq;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yycoin.service.IMayCurConsumeSubmitService;
import com.yycoin.service.IMayCurConsumeSubmitServiceGH;
import com.yycoin.service.IMayCurConsumeSubmitServiceTW;
import com.yycoin.service.IMayCurCorpSubmitService;
import com.yycoin.service.IMayCurCorpSubmitServiceGH;
import com.yycoin.service.IMayCurCorpSubmitServiceTW;
import com.yycoin.service.IMayCurExpenseSubmitService;
import com.yycoin.service.IMayCurExpenseSubmitServiceGH;
import com.yycoin.service.IMayCurExpenseSubmitServiceTW;

@Component
public class MqConsumeMsgListenerProcessor implements MessageListenerConcurrently {

	private static final Logger logger = LoggerFactory.getLogger(MqConsumeMsgListenerProcessor.class);

	@Autowired
	private IMayCurConsumeSubmitService mayCurConsumeSubmitService;

	@Autowired
	private IMayCurExpenseSubmitService mayCurExpenseSubmitService;

	@Autowired
	private IMayCurConsumeSubmitServiceTW mayCurConsumeSubmitServicetw;

	@Autowired
	private IMayCurExpenseSubmitServiceTW mayCurExpenseSubmitServicetw;

	@Autowired
	private IMayCurConsumeSubmitServiceGH mayCurConsumeSubmitServicegh;

	@Autowired
	private IMayCurExpenseSubmitServiceGH mayCurExpenseSubmitServicegh;
	
	@Autowired
	private IMayCurCorpSubmitService mayCurCorpSubmitService;
	
	@Autowired
	private IMayCurCorpSubmitServiceGH mayCurCorpSubmitServicegh;
	
	@Autowired
	private IMayCurCorpSubmitServiceTW mayCurCorpSubmitServicetw;

	@Override
	public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
		if (CollectionUtils.isEmpty(msgs)) {
			logger.info("接收到的消息为空，不做任何处理");
			return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
		}
		MessageExt messageExt = msgs.get(0);
		String reportId = new String(messageExt.getBody());
		logger.info("接收到的消息是：" + reportId);
		if ("MayCurTopic".equalsIgnoreCase(messageExt.getTopic())) {
			if ("ConsumerTag".equalsIgnoreCase(messageExt.getTags())) {
//				int reconsumeTimes = messageExt.getReconsumeTimes();
//				if (reconsumeTimes == 3) {
//					return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//				}
				logger.info("mq start create consume data,report id:" + reportId);
				if (StringUtils.isNotEmpty(reportId)) {
					try {
						mayCurConsumeSubmitService.saveSubmitData2OA(reportId);
						logger.info("mq end create consume data,report id:" + reportId);
					} catch (Exception e) {
						logger.error("reportid:" + reportId + " create oa consume data error", e);
					}
				}

			}
			if ("ExpenseTag".equalsIgnoreCase(messageExt.getTags())) {
//				int reconsumeTimes = messageExt.getReconsumeTimes();
//				if (reconsumeTimes == 3) {
//					return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//				}
				logger.info("mq start create expense data,report id:" + reportId);
				try {
					mayCurExpenseSubmitService.saveSubmitData2OA(reportId);
					logger.info("mq end create expense data,report id:" + reportId);
				} catch (Exception e) {
					logger.error("reportid:" + reportId + " create oa expense data error", e);
				}

			}

			if ("ConsumerTagTw".equalsIgnoreCase(messageExt.getTags())) {
//				int reconsumeTimes = messageExt.getReconsumeTimes();
//				if (reconsumeTimes == 3) {
//					return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//				}
				logger.info("mq start create tw consume data,report id:" + reportId);
				if (StringUtils.isNotEmpty(reportId)) {
					try {
						mayCurConsumeSubmitServicetw.saveSubmitData2OA(reportId);
						logger.info("mq end create tw consume data,report id:" + reportId);
					} catch (Exception e) {
						logger.error("reportid:" + reportId + " create tw oa consume data error", e);
					}
				}

			}
			if ("ExpenseTagTw".equalsIgnoreCase(messageExt.getTags())) {
//				int reconsumeTimes = messageExt.getReconsumeTimes();
//				if (reconsumeTimes == 3) {
//					return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//				}
				logger.info("mq start create tw expense data,report id:" + reportId);
				try {
					mayCurExpenseSubmitServicetw.saveSubmitData2OA(reportId);
					logger.info("mq end create tw expense data,report id:" + reportId);
				} catch (Exception e) {
					logger.error("reportid:" + reportId + " create tw oa expense data error", e);
				}

			}

			if ("ConsumerTagGh".equalsIgnoreCase(messageExt.getTags())) {
//				int reconsumeTimes = messageExt.getReconsumeTimes();
//				if (reconsumeTimes == 3) {
//					return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//				}
				logger.info("mq start create tw consume data,report id:" + reportId);
				if (StringUtils.isNotEmpty(reportId)) {
					try {
						mayCurConsumeSubmitServicegh.saveSubmitData2OA(reportId);
						logger.info("mq end create gh consume data,report id:" + reportId);
					} catch (Exception e) {
						logger.error("reportid:" + reportId + " create gh oa consume data error", e);
					}
				}

			}
			if ("ExpenseTagGh".equalsIgnoreCase(messageExt.getTags())) {
//				int reconsumeTimes = messageExt.getReconsumeTimes();
//				if (reconsumeTimes == 3) {
//					return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//				}
				logger.info("mq start create gh expense data,report id:" + reportId);
				try {
					mayCurExpenseSubmitServicegh.saveSubmitData2OA(reportId);
					logger.info("mq end create gh expense data,report id:" + reportId);
				} catch (Exception e) {
					logger.error("reportid:" + reportId + " create gh oa expense data error", e);
				}

			}
			if ("CorpSubmitTag".equalsIgnoreCase(messageExt.getTags())) {
				logger.info("mq start create corp submit data,report id:" + reportId);
				try {
					mayCurCorpSubmitService.saveSubmitData2OA(reportId);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					logger.error("reportid:" + reportId + " create corp submit data error", e);
				}
			}
			if ("CorpSubmitTagGh".equalsIgnoreCase(messageExt.getTags())) {
				logger.info("mq start create corp gh submit data,report id:" + reportId);
				try {
					mayCurCorpSubmitServicegh.saveSubmitData2OA(reportId);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					logger.error("reportid:" + reportId + " create corp submit data error", e);
				}
			}
			if ("CorpSubmitTagTw".equalsIgnoreCase(messageExt.getTags())) {
				logger.info("mq start create corp tw submit data,report id:" + reportId);
				try {
					mayCurCorpSubmitServicetw.saveSubmitData2OA(reportId);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					logger.error("reportid:" + reportId + " create corp submit data error", e);
				}
			}
		}

		return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
	}
}
