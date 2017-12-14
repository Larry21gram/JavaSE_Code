package com.about.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class About_String {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "  sdfghjklertyjkl牛  ";
		// str 的长度
		System.out.println(str.length());
		//替换所有的'd'
		System.out.println(str.replace('d', 'A'));
		System.out.println(str.replaceAll("j", "O"));
		//截取子串 		从第0位开始截取5个字符，包括开始位。
		System.out.println(str.substring(0, 5));
		//从5开始，直到最后。包括最后，不包括5位
		System.out.println(str.substring(5));
		// 分割 按照指定字符串"j"分割原字符串，得到字符串数组
		System.out.println(Arrays.toString(str.split("j")));
		// 将原字符串分割按照给定字符串“j”分割为两个长度为2的字符数组。如果后续还有“j”忽略。
		System.out.println(Arrays.toString(str.split("j", 2)));
		// 去掉前后空白字符
		String s = str.trim();
		System.out.println(s.length());
		// 比较内容
		System.out.println(str.equals(s));
		//
		int a = str.indexOf(s);
		int aa =str.indexOf("j", 5);
		System.out.println(aa);
		
		char ch = str.charAt(aa);
		System.out.println(ch);
		
		System.out.println(str.endsWith("a"));
		System.out.println(str.endsWith("a"));
		
		System.out.println(str.concat("xxxxxx"));
		
		System.out.println(str.contains(s));
		
		System.out.println(str.toUpperCase());
		
		System.out.println(Arrays.toString(str.toCharArray()));
		
		System.out.println(Arrays.toString(str.getBytes()));
		
		System.out.println(Arrays.toString(str.getBytes("utf-8")));
	}
}
