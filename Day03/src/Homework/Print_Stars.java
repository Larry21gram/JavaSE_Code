package Homework;

import java.util.Scanner;

/*
 * 打印菱形星星
 *   *
 *  ***
 * *****
 * ****
 */
public class Print_Stars {
	public static void main(String[] args) {
		int x = 5 ;
		Scanner input = new Scanner (System.in);
		System.out.println("请输入打印宽度（正整数）：");
		int num = input.nextInt();
		print(num);
		
		/*for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 5 - i - 1) {
					System.out.print(" ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}*/
	}
// 打印菱形星星  x 为最大宽度 
	public static void print(int  x ) {
		for (int i = 0; i < 2*x - 1; i++) {
			if (i < x  ) {
				for (int j = 0; j < x; j++) {
					if (j < x - i - 1 ) {
						System.out.print(" ");
					}
					else {
						System.out.print("* ");
					}
				}
			}
			else {
				for (int j = 0; j < x - 1; j++) {
					// i = x + i
					if (j < i - x ) {
						System.out.print(" ");
					}
					else {
						System.out.print(" *");
					}
				}
			}
			System.out.println();
		}
	}
	
}
