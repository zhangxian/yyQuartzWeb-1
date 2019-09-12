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
import com.yycoin.service.IMayCurExpenseSubmitService;

@Component
public class MqConsumeMsgListenerProcessor implements MessageListenerConcurrently {

	private static final Logger logger = LoggerFactory.getLogger(MqConsumeMsgListenerProcessor.class);

	@Autowired
	private IMayCurConsumeSubmitService mayCurConsumeSubmitService;

	@Autowired
	private IMayCurExpenseSubmitService mayCurExpenseSubmitService;

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
		}

		return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
	}
}