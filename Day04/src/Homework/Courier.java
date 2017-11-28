package Homework;

public class Courier {
	private String name ;
	private int age ;
	private double salary;
	private String company ;
	
	void eat() {
		 System.out.println("吃饭");
	}
	double buy() {
		return 20.3;
	}
	void call (String name) {
		System.out.println("给" + name +"打电话");
	}
	String speak(String name ) {
		return "和" + name + "谈话";
	}
}
