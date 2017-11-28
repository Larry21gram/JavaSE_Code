package Homework;
/*
 * 求数组中，最大值 、最小值、平均值 、元素之和
 */
public class About_Arrays {
	public static void main(String[] args) {
		int [] arr = {34, 34, 23, 56 ,243};
		System.out.println("最大值:" + getMax (arr));
		System.out.println("最小值 " + getMin(arr));
		System.out.println("平均值 " + getAvrage(arr));
		System.out.println("元素和 " + getSum(arr));
	}
	
// 最大值
	public static int getMax (int [] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max ;
	}
// 最小值
	public static int getMin(int [] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
//平均值
	public static double getAvrage(int [] arr) {
		double sum = 0 ; 
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / (double)arr.length;
	}
// 元素和
	public static int getSum(int [] arr) {
		int sum = 0 ; 
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum ;
	}
}


