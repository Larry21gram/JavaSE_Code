package Homework;

public class Salesperson {
	private String name ;
	private int age ;
	private double salary;
	private int epmNumber;
	
	void sale() {
		System.out.println("������");
	}
	void deletGoods(String goods) {
		System.out.println(goods + "����ˡ�");
	}
	String giveGoods() {
		return "����";
	}
	double giveChange(double money) {
		if (money > 50 ) {
			return money - 50;
		}
		else{
			System.out.println("����" +(50 - money));
			return 50 - money; 
		}
	}
}
