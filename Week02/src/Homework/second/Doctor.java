package Homework.second;

import Homework.first.Person;

public class Doctor extends Person implements UserInter {

	public Doctor(String name, String job) {
		super(name, job);
		// TODO Auto-generated constructor stub
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String name, String user, int passworld, String job) {
		super(name, user, passworld, job);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("ҽ����ʼ���ƣ�����");
		operation();
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("ҽ���ؼ��ˣ�����");
	}
	public void operation() {
		System.out.println("��ʼ����������");
	}
}
