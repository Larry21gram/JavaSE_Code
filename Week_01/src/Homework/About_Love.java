package Homework;

import java.util.Scanner;

// 打印 爱心型
/*  012345678901234
 * 0   **     **
 * 1 *    * *    *
 *2 *             * 
 *3 *	   	     *
 * 4  *         *
 * 5    *     *
 * 6      * *
 * 7       *
 */
public class About_Love {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入心的高度：");
		int high = input.nextInt();
		for (int i = 0; i < high; i++) {
			for (int j = 0; j < 2 * high; j++) {
				if (i <= Math.ceil(high * 0.25)) {
					if (j == high - 1 - 2 * i || j == high - 1 + 2 * i || j == Math.ceil(high) * 1.5 - i * 2 || j == Math.ceil(high) * 1.5 - 1 + i * 2  ) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
