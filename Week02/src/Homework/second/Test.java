package Homework.second;

import java.util.Date;
import java.util.Scanner;

import Homework.first.Person;
import Homework.first.UserData;

/*
 *   ��Main���У�������У�ʹ��Scanner�����û�������û���������
		Ȼ��ʹ��Login�еĵ�¼������¼��
		��¼�ɹ�����ʾ�û���ǰ��¼���û���������ְҵ����ǰϵͳʱ��
		��ʾ�Ƿ�ʼ������1���� 2����
		�������1�������onLine����
		����2�������offLine����
 */
public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1����¼\t\t2��ע��");
		int a = 0 ;
		if (input.hasNextInt()) {
			a = input.nextInt();
			if (a == 1) {
				work();
			}
			else if (a == 2) {
				Register.register();
			}
			else {
				System.out.println("������󣡣���");
			}
		}
		
	
	}
	
	public static void work() {
		Scanner input = new Scanner (System.in);
		System.out.println("�������û�����");
		String str = null ;
		if (input.hasNext()) {
			str = input.next();
//			System.out.println("str" + str );
		}
		System.out.println("���������룺");
		String str2 = null;
		if (input.hasNext()) {
			str2 = input.next();
//			System.out.println("str2" + str2);
		}
		UserInter p = Login.matching(str, str2);
		if (p != null) {
			System.out.println(p.toString() + "\n��ǰʱ�䣺" + new Date().toString() );
			
			System.out.println("�Ƿ�ʼ������\n1����\t\t2����");
			if (input.hasNextInt()) {
				int key = input.nextInt();
				if (key == 1) {
					p.onLine();
				}
				else if (key == 2) {
					p.offLine();
				}
				else {
					System.out.println("������󣡣���");
				}
			}	
		}
		else {
			System.out.println("��ȡʧ�ܣ�����");
		}
	}
}