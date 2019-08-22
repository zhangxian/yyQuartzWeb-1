package com.yycoin.util;

public enum MayCurOperationTypeEnum {

	SUBMIT("提交"), RECALL("召回"), AGREE("同意"), REJECT("驳回");

	private String code;

	private MayCurOperationTypeEnum(String code) {
		this.code = code;
	}

	public static MayCurOperationTypeEnum getEnumValueOf(String name) {
		return Enum.valueOf(MayCurOperationTypeEnum.class, name);
	}

	public String getValue() {
		return this.code;
	}

}
