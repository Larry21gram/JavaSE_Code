package Homework;

import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	/*	// 1 打印
		print();
		// 2、 编程计算： 189元如何使用最少的100，50，20，10 ，5 ， 1组成。并输出各自的值。
		// 分别定义 100 .50 20 .10 .5 .1 的张数
		System.out.println(getCount(189));
		// 3 、 有一个整数，判断奇数 还是偶数。
		System.out.println("请输入一个整数：");
		int num = input.nextInt();
		judge(num);
		//4、 铁路托运规定：行李不超过50公斤 ，托运费0.15元每公斤，如果超过50 ，则每公斤加收0.1元。
		System.out.println("请输入行李重量：");
		double weight = input.nextDouble();
		System.out.println("托运费：" + getPrice(weight));
		//5、 给定一个年份判断是否是闰年
		System.out.println("请输入年份");
		int year = input.nextInt();
		judgeYear(year);
		//6、二进制数的负数如何计算出来的
		System.out.println("请输入二进制的一个正数()：");
		byte b = input.nextByte();
		System.out.println(getNegative(b));*/
		//7、有10亿元，每天花一半 ，花多少天？
		System.out.println("请输入金钱：");
		double money = input.nextDouble();
		System.out.println("可以花：" + getDays(money) + "天");
	}

	public static void print() {
		System.out.println("*****************");
		System.out.println(" ***  JAVA   ***");
		System.out.println("*****************");
	}

	public static int getCount(int num) {
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
		int temp = 0;
		a = num / 100;
		temp = num % 100;
		b = temp / 50;
		temp = temp % 50;
		c = temp / 20;
		temp = temp % 20;
		d = temp / 10;
		temp = temp % 10;
		e = temp / 5;
		temp = temp % 5;
		f = temp;
		return a + b + c + d + e + f;
	}
	public static void judge(int num) {
		if (num % 2 == 0) {
			System.out.println(num + "是偶数!");
		}
		else {
			System.out.println(num + "是奇数");
		}
	}
	
	public static double getPrice(double weight) {
		double price = 0 ;
		if (weight >= 50) {
			price = 0.25 * (weight - 50) + 50 * 0.15;
		}
		else {
			price = 0.15 * weight ;
		}	
		return price = Math.ceil(price) ;
	}
	
	public static void judgeYear(int year) {
		if (year % 100 != 0 && year % 400 == 0 || year % 4 == 0) {
			System.out.println(year + "是闰年！");
		}
		else {
			System.out.println("不是闰年！");
		}
	}
	public static int getNegative(byte num) {
		// 先取反得 反码 ，在加1 得 补码 。
		return ~num + 1;
	}
	public static int getDays(double money) {
		int days = 0 ;
		while (money >= 0.1) {
			money = money / 2.0;
			days ++ ;
			// System.out.println(days);
		}
		return days;
	}
}
