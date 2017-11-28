package Homework;

import java.util.Scanner;

// 打印正方形
/*
 * 第一行 和最后一行为 全星
 * 第二行到最后倒数第二行
 * 第一个和最后一个都是星
 * 二行第二个和倒数第二个
 * 三行第三个和倒数第三个
 */
public class Print_Square {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入正方形的宽：");
		int wide = input.nextInt();
		for (int i = 0; i < wide; i++) {
			for (int j = 0; j < wide; j++) {
				if (i == 0 || i == wide - 1) {
					System.out.print("*");
				} 
				else if (j == i || j == wide - i - 1) {
					System.out.print("*");
				}
				else if (j == 0 || j == wide - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
