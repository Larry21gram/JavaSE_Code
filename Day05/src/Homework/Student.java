package Homework;

public class Student {
	private String name ;
	private int age ;
	private double height;
	private String school;
	
	void eat () {
		System.out.println("吃饭");
	}
	void read (String book) {
		System.out.println("朗读" + book);
	}
	String say() {
		return "老师好！！！";
	}
	String look(String book) {
		return "看" + book;
	}
}
