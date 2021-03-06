package About_Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入正数：");
		int num = input.nextInt();
		// 
		System.out.println("输入数的二进制补码：" + getNegative(num));
	}
	// 获得表示补码的字符串
	/**
	 * 获得表示某个输入的数的二进制补码的字符串
	 * @param num 从控制台输入的某个数
	 * @return 表示 num的二进制补码的字符串
	 */
	public static String getNegative(int num) {
		String str = "";
		int[] arr = new int[32];
		int flag = 0;
		while (num > 0) {
			arr[flag] = num % 2;
			num /= 2;
			flag++;
		}

		// 取倒序反码
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 1;
			} else {
				arr[i] = 0;
			}
		}

		// 取得反序补码 。 反码 转int 加 1
		long temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = (long) (temp + arr[i] * Math.pow(2, i));
		}
		// 反码加一为补码
		temp = temp + 1;
		System.out.println("输入数的十进制补码： " + temp);
		int[] arr2 = new int[32];
		int flag2 = 0;
		while (temp > 0) {
			arr2[flag2] = (int) (temp % 2);
			temp = temp / 2;
			flag2++;
		}

		// 获得正序补码
		for (int i = 0; i < arr2.length / 2; i++) {
			int temple = arr2[i];
			arr2[i] = arr2[arr2.length - 1 - i];
			arr2[arr2.length - 1 - i] = temple;
		}
		return Arrays.toString(arr2);
	}
}
