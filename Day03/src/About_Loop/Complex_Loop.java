package About_Loop;

import java.util.Scanner;

//复杂循环
public class Complex_Loop {
	/*
	 * public static void main(String[] args) { Scanner input = new
	 * Scanner(System.in); for (int i = 0; i <= 6; i++) { System.out.println(i +
	 * " + " + (6 - i) + " = " + 6); } // 任意输入整数的加法表。 System.out.println("请输入整数：");
	 * int sum = input.nextInt(); for (int i = 0; i <= sum; i++) {
	 * System.out.println(i + " + " + (sum - i) + " = " + sum); }
	 * System.out.println("*************************"); for (int i = 0 , j = sum; i
	 * <= sum; i++ , j--) { System.out.println(i + " + " + j + " = " + sum); } }
	 */
/*	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 每次循环表示一个班级
		double[][] arr = new double[5][6];
		for (int i = 1; i <= 5; i++) {
			// 每次循环表示一个学生的成绩
			int sum = 0 ;
			for (int j = 1; j <= 6; j++) {
				// 当两层循环执行完毕时，执行下面语句
				System.out.println("请输入第" + i + "班" + "第" + j + "位的成绩：");
				sum += arr[i-1][j-1] = input.nextDouble();
			}
			System.out.println("第"+ i + "班的平均分" + (sum/6));
		}
		input.close();
	}*/
	
/*	public static void main(String[] args) {
		// 打印矩形
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}*/
	public static void main(String[] args) {
		//九九乘法表
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i + 1; j++) {
			System.out.print("[" + j + " * " + i + " = " + j*i + " ]");	
			}
			System.out.println();
		}
	}
}
