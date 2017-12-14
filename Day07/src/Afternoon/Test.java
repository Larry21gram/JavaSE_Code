package Afternoon;

public class Test {
	public static void main(String[] args) {
	/*	Pig p = new Pig(2003);
		p.sleep();
		p.setRace("猪");
		System.out.println(p);
		*/
		
		//先调用父类的空参构造，在执行子类构造。
		Monkey m = new Monkey();
		
		m.sleep();
	}
}
