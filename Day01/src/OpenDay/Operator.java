package OpenDay;
/*
 * 运算符
 * 
 * 算术运算符
 *  
 * 逻辑运算符
 *  
 */
public class Operator {
	public static void main(String[] args) {
		int big = 5;
		int result = big / 2 ;
		double result2 = big / 2.0 ;
		double result3 = big / 2 ;
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		// Java中 所有整数默认为int型，所有小数默认为double 型
		if (result2 == result3) {
			System.out.println("big / 2.0  等于 big / 2 ");
		}
		System.out.println("big / 2.0  不等于 big / 2 ");
		
		int high = 180;
		//high自增1
		high ++ ;
		System.out.println(high);
		//直接打印试试
		System.out.println("high++:" + high++);
		//high++ 为先进行计算，再自增。 ++high 为先自增再计算。
		System.out.println("high:" + high);
		
	}
}
