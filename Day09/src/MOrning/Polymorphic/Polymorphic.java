package MOrning.Polymorphic;

import java.util.Scanner;

public class Polymorphic {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// ��̬
		Person p = new Teacher();
		Person pp = new Doctor();
		Person ppp = new Student();
			
		System.out.println("����ָ�\n1����ʦ��ʦ \t2��ҽ���о����� \t3��ѧ���Ͽ�");
			
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
				System.out.println("ָ����󣡣���");
			}
		} else {
			System.out.println("������󣡣�����");
		}
		c.work();
	}
}
