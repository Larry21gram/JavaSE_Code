package Homework;

public class Teacher {
	private String name ;
	private int age ;
	private String object;
	private Student[] stu;
	
	void speak() {
		System.out.println("讲课中！！！");
	}
	void teach(String object) {
		System.out.println("教授：" + object);
	}
	String write() {
		return "板书中。。。";
	}
	String  write (String world) {
		return "写的是：" + world;
	}
}
