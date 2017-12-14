package Homework;

public class Book {
	private String name ;
	private double price ;
	private double size;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	void display() {
		System.out.println("封面");
	}
	void write (String str ) {
		System.out.println(str + "写进书里了！！！");
	}
	String read () {
		return "书里有、、、";
	}
	Book buy(double money) {	
		return new Book();
	}
}
