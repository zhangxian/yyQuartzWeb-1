package com.yycoin.util;

/**
 * 对公报销科目凭证枚举类
 * 
 * @author Administrator
 *
 */
public enum MayCurCorpTypeEnum {

	// 银行中收
	EE1001("A1201404101514201082"),
	// 房租费
	F1001("A1201112140004373256"),
	// 福利体检费
	G1002("A1201112140004373039"), G1001("A1201112140004373039"),
	// 中介服务
	// TODO 待添加科目
	S1007(""),
	// 会议费
	K1002("A1201112140004373754"), K1001("A1201112140004373754"), N1004("A1201112140004373754"),
	K1003("A1201112140004373754"), HY1001("A1201112140004373754"), HY1002("A1201112140004373754"),
	HY1003("A1201112140004373754"),

	// 办公类
	A1002("A1201112140004373048"), A1003("A1201112140004373048"), A1004("A1201112140004373048"),
	A1005("A1201112140004373048"), E1001("A1201112140004373048"),

	// 营销类
	S1006("A1201112140004373503"), S1005("A1201112140004373503"), S1001("A1201112140004373503"),
	S1002("A1201112140004373503"), S1003("A1201112140004373503"), J1001("A1201112140004373503"),
	J1002("A1201112140004373503"),

	// 通信类
	P1001("A1201112140004373887"), P1002("A1201112140004373887"), P1003("A1201112140004373887"),
	// 后勤物业水电
	O1001("A1201112140004373831"),
	// 设计服务
	S1008("A1201112140004374356"),
	// 交通类
	L1005("A1201112140004373806"), L1004("A1201112140004373806"), L1001("A1201112140004373806"),
	L1002("A1201112140004373806"), L1003("A1201112140004373806"),
	// 保险
	B1002("A1201112140004373066"), L1007("A1201112140004373066"),
	// 维修保养费
	U1001("A1201112140004373951"),
	// 快递
	Y1001("A1201112140004373051"),
	// 信息咨询费
	T1004("A1201112140004373933"), T1005("A1201112140004373933"),
	// 固定资产
	I1001("A1201112140004374471"),
	// 无形资产
	Q1001("A1201207181106691571"),
	// 装修费
	// TODO 待添加科目
	U1004(""),
	// 培训费
	X1001("A1201112140004374296"),
	// 招聘
	AA1001("A1201112140004374323"), AA1002("A1201112140004374323"), AA1003("A1201112140004374323"),
	// 劳务费
	// TODO 待添加科目
	H1001("A1202002281699476147"),
	// 车船使用税
	// TODO 待添加科目
	B1001(""),

	// 团建
	TJ1007("A1201112140004373039"), TJ1009("A1201112140004373039"), TJ1001("A1201112140004373039"),
	TJ1002("A1201112140004373039"), TJ1003("A1201112140004373039"), TJ1004("A1201112140004373039"),
	TJ1005("A1201112140004373039"), TJ1006("A1201112140004373039"), TJ1010("A1201112140004373039"),

	// 社保
	CC1001("A1201308221410806609"),
	// 公积金
	DD1001("A1201308221410806626"),

	A1001("A1201112140004373048"),

	// 餐饮类---业务招待费
	W1001("A1201112140004374134"), W1002("A1201112140004374134"), W1003("A1201112140004374134"),
	W1004("A1201112140004374134"), W1005("A1201112140004374134"),

	// 后勤维修
	L1006("A1201112140004373951"),
	// 残障金
	// TODO 待添加科目
	DD1002("");

//	A1001("A1201112140004373048"), A1006("A1201112140004373048"), A1007("A1201112140004373048"),
//	A1008("A1201112140004373048"), A1009("A1201112140004373048"), A10010("A1201112140004373048"),
//	A10011("A1201112140004373048"), M1002("A1201112140004373048"), B1001("A1201112140004373066"),
//	B1002("A1201112140004373066"),
//
//	D10011("A1201112140004373609"), G1003("A1201112140004373039"), H1001("A9201108070000000001"),
//	I1001("A1201112140004374471"), L1001("A1201112140004373806"), L1002("A1201112140004373806"),
//	L1003("A1201112140004373806"), L1004("A1201112140004373806"), L1005("A1201112140004373806"),
//	L1007("A1201112140004373806"), M1001("A1201112140004374356"), N1003("A1201112140004373695"),
//
//	Q1001("A1201207181106691571"),
//
//	S1004("A1201112140004374325"), T1001("A1201112140004373933"), T1002("A1201112140004373933"),
//	T1003("A1201112140004373933"), T1004("A1201112140004373933"), T1005("A1201112140004373933"),
//	T1006("A1201112140004373933"), U1002("A1201112140004373951"), U1003("A1201112140004373951"),
//	V1002("A1201212211308554044"),
//
//	Y1001("A1201112140004373051"), Y1002("A1201112140004373051"), AA1001("A1201112140004374323"),
//	AA1002("A1201112140004374323"), AA1003("A1201112140004374323"), BB1001("A1201112140004373939"),
//	CC1001("A1201308221410806609"), DD1001("A1201308221410806626"), EE1001("A1201404101514201082");

	private String code;

	private MayCurCorpTypeEnum(String code) {
		this.code = code;
	}

	public static MayCurCorpTypeEnum getEnumValueOf(String name) {
		return Enum.valueOf(MayCurCorpTypeEnum.class, name);
	}

	public String getValue() {
		return this.code;
	}

}
