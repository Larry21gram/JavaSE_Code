package Homework.second;

import Homework.first.Person;

public class Worker extends Person implements UserInter {
	
	public Worker(String name, String job) {
		super(name, job);
		// TODO Auto-generated constructor stub
	}

	public Worker() {
		super();
	}

	public Worker(String name, String user, int passworld, String job) {
		super(name, user, passworld, job);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("���˿�ʼ�ɻ����");
		carry();
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("�����°�ؼң�������");
	}
	public void carry() {
		System.out.println("��ש��������");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
