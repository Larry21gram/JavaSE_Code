package After.random;

import java.util.Random;
	/*
	 * �����
	 */
public class Test {
	public static void main(String[] args) {
		Random ran = new Random();
		// ������Χ�ڵ����������������ҿ� [ 0 , 50 ) ��
		int r = ran.nextInt(50);
		System.out.println(r);
		
		//ָ�����������[30 , 45]
		r = ran.nextInt(45 - 30 + 1) + 30;
		System.out.println(r);
		
		// �������ֵ
		boolean b = ran.nextBoolean();
		System.out.println(b);
	}
}
