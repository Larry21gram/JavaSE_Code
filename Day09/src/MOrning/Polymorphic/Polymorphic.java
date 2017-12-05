package MOrning.Polymorphic;

import java.util.Scanner;

public class Polymorphic {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 多态
		Person p = new Teacher();
		Person pp = new Doctor();
		Person ppp = new Student();
			
		System.out.println("输入指令：\n1、老师教师 \t2、医生研究病毒 \t3、学生上课");
			
		Company2 c = new Company2();
		
		if (input.hasNextInt()) {
			int t = input.nextInt();
			if ( t== 1) {
				c.setPerson(p);
			} else if (t == 2) {
				c.setPerson(pp);
			} else if (t == 3) {
				c.setPerson(ppp);
			}else {
				System.out.println("指令错误！！！");
			}
		} else {
			System.out.println("输入错误！！！！");
		}
		c.work();
	}
}
