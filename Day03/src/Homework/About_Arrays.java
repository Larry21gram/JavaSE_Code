package Homework;
/*
 * �������У����ֵ ����Сֵ��ƽ��ֵ ��Ԫ��֮��
 */
public class About_Arrays {
	public static void main(String[] args) {
		int [] arr = {34, 34, 23, 56 ,243};
		System.out.println("���ֵ:" + getMax (arr));
		System.out.println("��Сֵ " + getMin(arr));
		System.out.println("ƽ��ֵ " + getAvrage(arr));
		System.out.println("Ԫ�غ� " + getSum(arr));
	}
	
// ���ֵ
	public static int getMax (int [] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max ;
	}
// ��Сֵ
	public static int getMin(int [] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
//ƽ��ֵ
	public static double getAvrage(int [] arr) {
		double sum = 0 ; 
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / (double)arr.length;
	}
// Ԫ�غ�
	public static int getSum(int [] arr) {
		int sum = 0 ; 
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum ;
	}
}


