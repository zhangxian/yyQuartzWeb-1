package com.yycoin.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static String transferLongToDate(String dateFormat, Long millSec) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date date = new Date(millSec);
		return sdf.format(date);
	}

	/**
	 * 日期格式化
	 * 
	 * @param source
	 * @return
	 */
	public static String getDateStringByDate(Date source, String dateFormat) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(source);
	}

	public static String getCurrDateTime() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		return df.format(c.getTime());
	}

	public static String getCurrDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		return df.format(c.getTime());
	}

	/**
	 * 获取当前月第一天
	 */
	public static String getCurrMonthFirstDay() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, 1);// 设置为1号,当前日期既为本月第一天
		String firstDay = format.format(c.getTime());
		return firstDay;

	}

	/**
	 * 根据日期，获取日期差的day
	 * 
	 * @param dt
	 * @param margin
	 * @return
	 */
	public static String getDateStringByMargin(String dtString, int margin) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = "";
		try {
			Date date = format.parse(dtString);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.DAY_OF_MONTH, margin);
			dateString = format.format(c.getTime());
		} catch (ParseException px) {
			px.printStackTrace();
		}
		return dateString;
	}

	/**
	 * 获取当前月最后一天
	 */
	public static String getCurrMonthLastDay() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar ca = Calendar.getInstance();
		ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
		String lastDay = format.format(ca.getTime());
		return lastDay;

	}

	public static String longToDate(long lo) {
		Date date = new Date(lo);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sd.format(date);

	}

	public static String longToDateYYYYMMDD(long lo) {
		Date date = new Date(lo);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		return sd.format(date);

	}

	public static long daysBetweenToday(String firstDay, String lastDay) {
		Date firstDate = null;
		Date lastDate = null;
		try {
			firstDate = new SimpleDateFormat("yyyy-MM-dd").parse(firstDay);
			lastDate = new SimpleDateFormat("yyyy-MM-dd").parse(lastDay);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		long betweenDate = (lastDate.getTime() - firstDate.getTime()) / (60 * 60 * 24 * 1000);
		return betweenDate;
	}

}
