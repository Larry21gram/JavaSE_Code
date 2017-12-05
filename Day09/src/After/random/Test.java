package After.random;

import java.util.Random;
	/*
	 * 随机数
	 */
public class Test {
	public static void main(String[] args) {
		Random ran = new Random();
		// 给定范围内的随机数（区间左闭右开 [ 0 , 50 ) ）
		int r = ran.nextInt(50);
		System.out.println(r);
		
		//指定区间随机数[30 , 45]
		r = ran.nextInt(45 - 30 + 1) + 30;
		System.out.println(r);
		
		// 随机布尔值
		boolean b = ran.nextBoolean();
		System.out.println(b);
	}
}
