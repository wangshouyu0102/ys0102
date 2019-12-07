package com.lmj.utils;

import org.junit.Test;

public class StringUtil {

	/**
	 * 判断是否为空字符串	
	 */
	public static boolean isEmpty(String str) {
		return str == null || str.trim().length() <=0;
	}
	
	/**
	 * 判断是否是手机号码
	 * @param args
	 */
	public static boolean isPhone(String str) {
		String regex = "1[3|5|6|7|8]\\d{9}";
		return str.matches(regex);
	}
	
	/**
	 * 判断是否是邮箱
	 * @param str
	 * @return
	 */
	public static boolean isEmail(String str) {
		String regex = "\\w+@\\w+(.com|.cn|.cn.com)";
		return str.matches(regex);
	}
	
	public static boolean isString(String str) {
		String regex = "[a-zA-Z]+";
		return str.matches(regex);
	}
	
	@Test
	public void test() {
		String str  = "";
		System.out.println(isEmpty(str));
	}
	
	@Test
	public void test1() {
		String str  = "1323";
		System.out.println(isPhone(str));
	}
	
	@Test
	public void test2() {
		String str  = "1323";
		System.out.println(isEmail(str));
	}
	
	@Test
	public void test3() {
		String str  = "abcde";
		System.out.println(isString(str));
	}
	
}
