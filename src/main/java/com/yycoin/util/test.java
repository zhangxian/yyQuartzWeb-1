package com.yycoin.util;

public class test {
	public static void main(String[] args) {
		MayCurExpenseTypeEnum n = MayCurExpenseTypeEnum.getEnumValueOf("B1001");
		System.out.println(n.getValue());
	}
}
