package com.yycoin.mq;

import org.apache.commons.lang.StringUtils;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MqProducerConfiguration {

	private static Logger logger = LoggerFactory.getLogger(MqProducerConfiguration.class);

	@Value("${apache.rocketmq.producer.groupName}")
	private String groupName;

	@Value("${apache.rocketmq.producer.namesrvAddr}")
	private String namesrvAddr;

	/**
	 * 消息最大大小，默认4M
	 */
	@Value("${apache.rocketmq.producer.maxMessageSize}")
	private Integer maxMessageSize;
	/**
	 * 消息发送超时时间，默认3秒
	 */
	@Value("${apache.rocketmq.producer.sendMsgTimeout}")
	private Integer sendMsgTimeout;
	/**
	 * 消息发送失败重试次数，默认2次
	 */
	@Value("${apache.rocketmq.producer.retryTimesWhenSendFailed}")
	private Integer retryTimesWhenSendFailed;

	@Value("${apache.rocketmq.producer.topicName}")
	private String topicName;

	@Bean
	public DefaultMQProducer getRocketMQProducer() throws RocketMQException {

		if (StringUtils.isEmpty(this.groupName)) {
			throw new RocketMQException(RocketMQErrorEnum.PARAMM_NULL, "groupName is blank", false);
		}

		if (StringUtils.isEmpty(this.namesrvAddr)) {
			throw new RocketMQException(RocketMQErrorEnum.PARAMM_NULL, "nameServerAddr is blank", false);
		}

		DefaultMQProducer producer;
		producer = new DefaultMQProducer(this.groupName);

		producer.setNamesrvAddr(this.namesrvAddr);
		producer.setCreateTopicKey(topicName);

		// 如果需要同一个jvm中不同的producer往不同的mq集群发送消息，需要设置不同的instanceName
		// producer.setInstanceName(instanceName);
		if (this.maxMessageSize != null) {
			producer.setMaxMessageSize(this.maxMessageSize);
		}
		if (this.sendMsgTimeout != null) {
			producer.setSendMsgTimeout(this.sendMsgTimeout);
		}
		// 如果发送消息失败，设置重试次数，默认为2次
		if (this.retryTimesWhenSendFailed != null) {
			producer.setRetryTimesWhenSendFailed(this.retryTimesWhenSendFailed);
		}

		try {
			producer.start();

			logger.info(String.format("producer is start ! groupName:[%s],namesrvAddr:[%s]", this.groupName,
					this.namesrvAddr));
		} catch (MQClientException e) {
			logger.error(String.format("producer is error {}", e.getMessage(), e));
			throw new RocketMQException(e);
		}
		return producer;

	}
}
