package Homework;

public class Salesperson {
	private String name ;
	private int age ;
	private double salary;
	private int epmNumber;
	
	void sale() {
		System.out.println("卖东西");
	}
	void deletGoods(String goods) {
		System.out.println(goods + "入库了。");
	}
	String giveGoods() {
		return "货物";
	}
	double giveChange(double money) {
		if (money > 50 ) {
			return money - 50;
		}
		else{
			System.out.println("还差" +(50 - money));
			return 50 - money; 
		}
	}
}
