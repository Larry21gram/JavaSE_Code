package Afternoon;

import java.util.Arrays;
import java.util.Date;

public class About_Arrays {
	public static void main(String[] args) {
		int[] arr = {4,1,12,12,4,5,87,6,1,};
		/*
		 * ��������
		 * �Ѻ����������ν��в��룬����ʱ��������
		 * ��ǰ���Ԫ�ؿ���һ�� ����
		 * 
		 */
		 long start = System.currentTimeMillis( );
		System.out.println(start);
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				int temp = arr[i];
				int m = i ;
				//��arr[i] �� �� �Ǳ�С��i��Ԫ���Ѿ���һ���������е�������
				for (int j = m ; j > 0 ; j--) {
					if (arr[j] < arr [j-1]) {
						int temp1 = arr[j];
						arr[j] = arr[j - 1] ;
						arr[j - 1] = temp1;
					}
				}
			}
		}
		
		//Arrays.sort(arr);
		long end = System.currentTimeMillis( );
		System.out.println(end);
		System.out.println(Arrays.toString(arr));
		System.out.println(end - start);
	}
}
