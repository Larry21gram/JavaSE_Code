package MOrning.Polymorphic;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("输入指令：\n1、老师教师\t2、医生研究病毒");
		Company c = new Company();
		
		if (input.hasNextInt()) {
			if (input.nextInt() == 1) {
				c.setTeacher(new Teacher());
			} else if (input.nextInt() == 2) {
				c.setDoctor(new Doctor());
			} else {
				System.out.println("指令错误！！！");
			}
		} else {
			System.out.println("输入错误！！！！");
		}
		c.work();
	}

	
}
