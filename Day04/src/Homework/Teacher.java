package Homework;

public class Teacher {
	private String name ;
	private int age ;
	private String object;
	private Student[] stu;
	
	void speak() {
		System.out.println("�����У�����");
	}
	void teach(String object) {
		System.out.println("���ڣ�" + object);
	}
	String write() {
		return "�����С�����";
	}
	String  write (String world) {
		return "д���ǣ�" + world;
	}
}
