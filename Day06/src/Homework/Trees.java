package Homework;

public class Trees {
	private String name ;
	private int age ;
	private double height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	void say() {
		System.out.println("这是一棵树！！！");
	}
	void grow(String fertilizer) {
		System.out.println("生长");
	}
	String use() {
		return "床";
	}
	String use( String condition) {
		return "纸";
	}
}
