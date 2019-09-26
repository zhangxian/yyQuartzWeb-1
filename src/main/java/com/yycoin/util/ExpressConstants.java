package com.yycoin.util;

/**
 * 快递状态常量类
 * 
 * @author Administrator
 *
 */
public interface ExpressConstants {

	public static final int SF_STATUS_50 = 50;

	public static final int SF_STATUS_30 = 30;

	public static final int SF_STATUS_31 = 31;

	public static final int SF_STATUS_607 = 607;

	/**
	 * 已到达目的地网点，即将派件
	 */
	public static final int SF_STATUS_130 = 130;

	public static final int SF_STATUS_123 = 123;

	/**
	 * 已签收
	 */
	public static final int SF_STATUS_80 = 80;

	public static final int SF_STATUS_8000 = 8000;

	/**
	 * 快件已退回
	 */
	public static final int SF_STATUS_631 = 631;

	public static final int SF_STATUS_648 = 648;

	public static final int SF_STATUS_99 = 99;

	/**
	 * 发货状态 初始
	 */
	public static final int SHIP_STATUS_INIT = 0;

	/**
	 * 发货状态 已拣配
	 */
	public static final int SHIP_STATUS_PICKUP = 1;

	/**
	 * 发货状态 已发货
	 */
	public static final int SHIP_STATUS_CONSIGN = 2;

	/**
	 * 发货状态 已打印
	 */
	public static final int SHIP_STATUS_PRINT = 3;

	/**
	 * #328
	 */
	public static final int SHIP_STATUS_PRINT_INVOICEINS = 5;

	/**
	 * #95 快递100状态+10
	 */
	public static final int SHIP_STATUS_PRINT_ZAITU = 10;

	public static final int SHIP_STATUS_PRINT_SIGNED = 13;

	public static final int SHIP_STATUS_PRINT_RE_SIGNED = 14;

	public static final int SHIP_STATUS_PRINT_RETURN = 16;

	/**
	 * 快递100状态,快递单当前状态，包括0在途，1揽收，2疑难，3签收，4退签，5派件，6退回等7个状态
	 */
	public static final int KD_100_STATUS_SIGNED = 3;

	public static final int KD_100_STATUS_RE_SIGNED = 4;

	public static final int KD_100_STATUS_RETURN = 6;
}
