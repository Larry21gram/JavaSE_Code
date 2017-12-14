package com.about.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class About_String {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "  sdfghjklertyjklţ  ";
		// str �ĳ���
		System.out.println(str.length());
		//�滻���е�'d'
		System.out.println(str.replace('d', 'A'));
		System.out.println(str.replaceAll("j", "O"));
		//��ȡ�Ӵ� 		�ӵ�0λ��ʼ��ȡ5���ַ���������ʼλ��
		System.out.println(str.substring(0, 5));
		//��5��ʼ��ֱ����󡣰�����󣬲�����5λ
		System.out.println(str.substring(5));
		// �ָ� ����ָ���ַ���"j"�ָ�ԭ�ַ������õ��ַ�������
		System.out.println(Arrays.toString(str.split("j")));
		// ��ԭ�ַ����ָ�ո����ַ�����j���ָ�Ϊ��������Ϊ2���ַ����顣����������С�j�����ԡ�
		System.out.println(Arrays.toString(str.split("j", 2)));
		// ȥ��ǰ��հ��ַ�
		String s = str.trim();
		System.out.println(s.length());
		// �Ƚ�����
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
