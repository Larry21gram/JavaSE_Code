package Homework.second;

import Homework.first.Person;

public class Boss extends Person implements UserInter {

	public Boss(String name, String job) {
		super(name, job);
		// TODO Auto-generated constructor stub
	}

	public Boss(String name, String user, int passworld, String job) {
		super(name, user, passworld, job);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("�ϰ忪ʼ�������");
		talk();
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("�ϰ�ȼ�ȥ�ˣ�����");
	}

	public void talk() {
		System.out.println("Ǣ̸���񣡣�����");
	}
}
