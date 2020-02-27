package com.yycoin.util;

public interface BaseContants {

	/**
	 * json返回成功码
	 */
	public static final String RESULT_SUCCESS_CODE = "0000";

	/**
	 * json返回异常码
	 */
	public static final String RESULT_ERROR_CODE = "1111";

	/**
	 * 调度任务默认组名
	 */
	public static final String SCHEDULER_DEFAULT_GROUP_NAME = "group1";

	/**
	 * 默认日期格式
	 */
	public static final String DATE_FORMAT_YYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

	public static final String DATE_FORMAT_YYYYMM = "yyyy-MM";

	public static final String DATE_FORMAT_YYYYMMDD = "yyyy-MM-dd";

	public static final String DATE_FORMAT_YYYYMMDDHHMM = "yyyy-MM-dd HH:mm";

	/**
	 * 每刻接口返回成功
	 */
	public static final String MAYCUR_SUCCESS_CODE = "ACK";

	/**
	 * 每刻接口返回失败
	 */
	public static final String MAYCUR_FAIL_CODE = "NACK";

	/**
	 * 报销申请的单据前缀
	 */
	public static final String COMMON_SEQUENCE_UT_PREFIX = "UT";

	/**
	 * 凭证的单据前缀
	 */
	public static final String COMMON_SEQUENCE_PZ_PREFIX = "PZ";

	/**
	 * 每刻单据类型:差旅费申请及借款
	 */
	public static final String MAYCUR_FORM_SUBTYPE_CLFSQ = "CLSQJJK";

	/**
	 * 每刻单据类型:对公业务申请
	 */
	public static final String MAYCUR_FORM_SUBTYPE_DGYWSQ = "DGYWSQ";

	/**
	 * 每刻单据类型:差旅费报销单
	 */
	public static final String MAYCUR_FORM_SUBTYPE_CLFBXD = "CLFBXD";

	/**
	 * 每刻单据类型:日常费用报销
	 */
	public static final String MAYCUR_FORM_SUBTYPE_RCFYBX = "RCFYBX";

	/**
	 * 每刻单据类型:通用报销
	 */
	public static final String MAYCUR_FORM_SUBTYPE_TYBX = "TYBX";

	/**
	 * 流程key
	 */
	public static final String CONSUME_WORKFLOW_KEY = "workflow-2018";

	/**
	 * 员工借款
	 */
	public static final int CONSUME_PAY_TYPE_98 = 98;

	/**
	 * 财务待支付
	 */
	public static final int TRAVELAPPLYSTATUS_22 = 22;

	/**
	 * 流程结束
	 */
	public static final int TRAVELAPPLYSTATUS_99 = 99;

	/**
	 * 财务待支付
	 */
	public static final int TCP_STATUS_WAIT_PAY = 22;
	/**
	 * 差旅费报销
	 */
	public static final int TCP_EXPENSETYPE_TRAVEL = 11;

	/**
	 * 日常费用报销(日常办公和固定资产采购申请及借/对公业务申请及借款)
	 */
	public static final int TCP_EXPENSETYPE_PUBLIC = 13;

	/**
	 * 通用费用报销
	 */
	public static final int TCP_EXPENSETYPE_COMMON = 14;

	/**
	 * 报销-出差报销
	 */
	public static final int FINANCE_CREATETYPE_EXPENSE_BORROW = 80;

	/**
	 * 报销-日常费用报销
	 */
	public static final int FINANCE_CREATETYPE_EXPENSE_PUBLIC = 82;

	/**
	 * 报销-通用报销
	 */
	public static final int FINANCE_CREATETYPE_EXPENSE_COMMON = 83;

	/**
	 * 收/付款单id的前缀
	 */
	public static final String ID_BILL_PREFIX = "SF";

	/**
	 * 借方
	 */
	public static final int TAX_FORWARD_IN = 0;

	/**
	 * 贷方
	 */
	public static final int TAX_FORWARD_OUT = 1;

	/**
	 * 其他应收款_备用金(部门/职员)
	 */
	public static final String OTHER_RECEIVE_BORROW = "1133-01";

	/**
	 * 预付账款
	 */

	public static final String PREPAID_ACCOUNTS = "1151";

	/**
	 * 银行存款科目
	 */
	public static final String BANK_CREDIT_VOUCHER_SUBJECT = "1002-01-01-14";

	/**
	 * 差旅费科目
	 */
	public static final String TRAVEL_VOUCHER_SUBJECT = "5504-004";

	/**
	 * 管理
	 */
	public static final int FINANCE_TYPE_MANAGER = 0;

	/**
	 * 普通凭证
	 */
	public static final int FINANCE_TYPE_DUTY = 1;

	/**
	 * 纳税-1
	 */
	public static final String DEFAULR_DUTY_ID = "90201008080000000001";

	/**
	 * 本年利润(无)
	 */
	public static final String YEAR_PROFIT = "3131";

	/**
	 * 销售系
	 */
	public static final int OTYPE_SAIL = 0;

	/**
	 * 默认银行付款账户
	 */
	public static final String DEFAULT_BANK_PAY_ACCOUNT = "125902780610502";

	/**
	 * 阿里云短信发送成功状态码
	 */
	public static final String ALI_SMS_RESULT_SUCCESS = "OK";

	/**
	 * "商品拣配”增加查询条件 “发票单发” CK单中只有A或FP开头的单号
	 */
	public static final int INVOICE_SHIP_ALONE = 0;

	/**
	 * 非发票单发
	 */
	public static final int INVOICE_SHIP_FOLLOW_OUT = 1;

	/**
	 * "商品拣配”增加查询条件 “赠品单发” CK单中只有ZS开头的单号
	 */
	public static final int ZS_SHIP_ALONE = 0;

	/**
	 * 非赠品单发
	 */
	public static final int ZS_SHIP_FOLLOW_OUT = 1;

	/**
	 * 实体代码--体内
	 */
	public static final String ENTITY_CODE_TN = "yytn";

	/**
	 * 实体代码--体外
	 */
	public static final String ENTITY_CODE_TW = "yytw";

	/**
	 * 实体代码--国华
	 */
	public static final String ENTITY_CODE_GH = "yygh";

}
