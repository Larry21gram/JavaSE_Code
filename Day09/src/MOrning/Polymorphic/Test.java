package MOrning.Polymorphic;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("����ָ�\n1����ʦ��ʦ\t2��ҽ���о�����");
		Company c = new Company();
		
		if (input.hasNextInt()) {
			if (input.nextInt() == 1) {
				c.setTeacher(new Teacher());
			} else if (input.nextInt() == 2) {
				c.setDoctor(new Doctor());
			} else {
				System.out.println("ָ����󣡣���");
			}
		} else {
			System.out.println("������󣡣�����");
		}
		c.work();
	}

	
}
