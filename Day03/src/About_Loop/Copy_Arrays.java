package About_Loop;

import java.util.Arrays;

public class Copy_Arrays {
	public static void main(String[] args) {
		//在数组中插入一个数
		int [] arr = new int[] {40 ,50 ,60 ,70 ,30 };
		/*int placeholder = 65;
		Arrays.sort(arr);
		int [] arrays = Arrays.copyOf(arr, arr.length + 1);
		arrays[arrays.length - 1] = placeholder ;
		Arrays.sort(arrays);
		System.out.println(Arrays.toString(arrays));
		
		System.out.println("*************************");*/
		System.out.println(Arrays.toString(insert(45,4,arr)));
		
	}
	
	//数组中指定位置插入值 
	public static int[] insert (int num , int index , int [] arr) {
		System.out.println(Arrays.toString(arr));
		int [] arrays = Arrays.copyOf(arr, arr.length + 1);
		if (index >= arrays.length) {
			System.out.println("index 越界");
			return null;
		}
		else {
			for (int i = arrays.length - 1; i > index; i--) {
				arrays[i] = arrays[i - 1];
			}
			arrays[index] = num;
			return arrays ;
		}
	}
	
	//遍历数组
	public static void print(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
