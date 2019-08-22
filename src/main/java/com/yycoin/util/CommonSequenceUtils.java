package com.yycoin.util;

import com.china.center.tools.StringTools;

public class CommonSequenceUtils {

	public static String getSquenceString20(String sequence) {
		String formatString20 = StringTools.formatString20(sequence);

		return formatString20;
	}

	public static String getSquenceString20(String pfix, String sequence) {
		String formatString20 = StringTools.formatString20(pfix, sequence);

		return formatString20;
	}

}
