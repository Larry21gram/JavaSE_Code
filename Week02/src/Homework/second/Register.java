package Homework.second;

import java.util.Scanner;

import Homework.first.Person;
import Homework.first.UserData;

// ע��
public class Register {
	public static void main(String[] args) {
		
	}
	public static void register() {
		Scanner input = new Scanner(System.in);	
		// ע��
		boolean flag = true ;
		while(flag) {
			System.out.println("�����ע�᣺\n������������");
			String name = null, user = null, job = null ;
			if (input.hasNext()) {
				name = input.next();
				System.out.println("�������û�����");
				if (input.hasNext()) {
					user = input.next();
					System.out.println("�������λ���룺");
					if (input.hasNextInt()) {
						int key= input.nextInt();
						System.out.println("��ѡ�����ְҵ��"
								+ "\n1��Worker\t2��Doctor\t3��Cooker\t4��Boss");
						if (input.hasNextInt()) {
							int kk = input.nextInt();
							switch (kk) {
							case 1:
								UserData.list.add(new Worker(name, user,key,job));
								System.out.println("��ϲ��ע��ɹ�������");
								flag = false;								
								break;
							case 2:
								UserData.list.add(new Doctor(name, user,key,job));
								System.out.println("��ϲ��ע��ɹ�������");
								flag = false;
								break;
							case 3:
								UserData.list.add(new Cooker(name, user,key,job));
								System.out.println("��ϲ��ע��ɹ�������");
								flag = false;
								break;
							case 4:
								UserData.list.add(new Boss(name, user,key,job));
								System.out.println("��ϲ��ע��ɹ�������");
								flag = false;
								break;

							default:
								System.out.println("ְҵѡ����󣡣���");
								break;
							}
						}
					}
				}
			}
		}
	}
}
