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
		System.out.println("医生开始治疗！！！");
		operation();
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("医生回家了！！！");
	}
	public void operation() {
		System.out.println("开始手术！！！");
	}
}
