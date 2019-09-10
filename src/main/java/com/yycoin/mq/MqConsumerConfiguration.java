package com.yycoin.mq;

import org.apache.commons.lang.StringUtils;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MqConsumerConfiguration {

	public static final Logger logger = LoggerFactory.getLogger(MqConsumerConfiguration.class);

	@Value("${apache.rocketmq.consumer.namesrvAddr}")
	private String namesrvAddr;

	@Value("${apache.rocketmq.consumer.groupName}")
	private String groupName;

	@Value("${apache.rocketmq.consumer.consumeThreadMin}")
	private int consumeThreadMin;

	@Value("${apache.rocketmq.consumer.consumeThreadMax}")
	private int consumeThreadMax;

	@Value("${apache.rocketmq.consumer.topicName}")
	private String topicName;

	@Value("${apache.rocketmq.consumer.consumeMessageBatchMaxSize}")
	private int consumeMessageBatchMaxSize;

	@Autowired
	private MqConsumeMsgListenerProcessor mqMessageListenerProcessor;

	@Bean
	public DefaultMQPushConsumer getRocketMQConsumer() throws RocketMQException {

		if (StringUtils.isEmpty(groupName)) {
			throw new RocketMQException(RocketMQErrorEnum.PARAMM_NULL, "groupName is null !!!", false);
		}
		if (StringUtils.isEmpty(namesrvAddr)) {
			throw new RocketMQException(RocketMQErrorEnum.PARAMM_NULL, "namesrvAddr is null !!!", false);
		}
		if (StringUtils.isEmpty(topicName)) {
			throw new RocketMQException(RocketMQErrorEnum.PARAMM_NULL, "topics is null !!!", false);
		}

		DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(groupName);
		consumer.setNamesrvAddr(namesrvAddr);
		consumer.setConsumeThreadMin(consumeThreadMin);
		consumer.setConsumeThreadMax(consumeThreadMax);
		consumer.registerMessageListener(mqMessageListenerProcessor);

		/**
		 * 设置Consumer第一次启动是从队列头部开始消费还是队列尾部开始消费 如果非第一次启动，那么按照上次消费的位置继续消费
		 */
		consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
		/**
		 * 设置消费模型，集群还是广播，默认为集群
		 */
		// consumer.setMessageModel(MessageModel.CLUSTERING);

		/**
		 * 设置一次消费消息的条数，默认为1条
		 */
		consumer.setConsumeMessageBatchMaxSize(consumeMessageBatchMaxSize);

		try {
			/**
			 * 设置该消费者订阅的主题和tag，如果是订阅该主题下的所有tag，
			 * 则tag使用*；如果需要指定订阅该主题下的某些tag，则使用||分割，例如tag1||tag2||tag3
			 */
			/*
			 * String[] topicTagsArr = topics.split(";"); for (String topicTags :
			 * topicTagsArr) { String[] topicTag = topicTags.split("~");
			 * consumer.subscribe(topicTag[0],topicTag[1]); }
			 */
			consumer.subscribe(topicName, "ConsumerTag||ExpenseTag");

			consumer.start();
			logger.info("consumer is start !!!groupName:{},topics:{},namesrvAddr:{}", groupName, topicName,
					namesrvAddr);

		} catch (Exception e) {
			// logger.error("consumer is start !!!
			// groupName:{},topics:{},namesrvAddr:{}",groupName,topics,namesrvAddr,e);
			throw new RocketMQException(e);
		}

		return consumer;
	}
}
