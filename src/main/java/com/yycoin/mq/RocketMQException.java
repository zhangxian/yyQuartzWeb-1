package com.yycoin.mq;

public class RocketMQException extends AppException {
	private static final long serialVersionUID = 1L;

	/**
	 * 无参构造函数
	 */
	public RocketMQException() {
		super();
	}

	public RocketMQException(Throwable e) {
		super(e);
	}

	public RocketMQException(RocketMQErrorCode errorType) {
		super(errorType);
	}

	public RocketMQException(RocketMQErrorCode errorCode, String... errMsg) {
		super(errorCode, errMsg);
	}

	/**
	 * 封装异常
	 * 
	 * @param errorCode
	 * @param errMsg
	 * @param isTransfer 是否转换异常信息，如果为false,则直接使用errMsg信息
	 */
	public RocketMQException(RocketMQErrorCode errorCode, String errMsg, Boolean isTransfer) {
		super(errorCode, errMsg, isTransfer);
	}

	public RocketMQException(RocketMQErrorCode errCode, Throwable cause, String... errMsg) {
		super(errCode, cause, errMsg);
	}
}