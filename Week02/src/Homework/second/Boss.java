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
		System.out.println("老板开始出差！！！");
		talk();
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("老板度假去了！！！");
	}

	public void talk() {
		System.out.println("洽谈商务！！！！");
	}
}
