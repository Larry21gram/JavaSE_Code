package Homework.second;

import Homework.first.Person;

public class Cooker extends Person implements UserInter {

	public Cooker(String name, String job) {
		super(name, job);
		// TODO Auto-generated constructor stub
	}

	public Cooker(String name, String user, int passworld, String job) {
		super(name, user, passworld, job);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("��ʦ��ʼ������������");
		cook();
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("��ʦ�ؼ���Ϣ�ˣ�����");
	}

	public void cook() {
		System.out.println("������ɽƮѩ������");
	}
}
