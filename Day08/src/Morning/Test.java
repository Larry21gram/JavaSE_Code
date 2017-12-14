package Morning;

public class Test {
	public static void main(String[] args) {
/*		BigCar bg = new BigCar();
		bg.setWheels(4);
		bg.show();
		// 子类调用父类的方法时的路线    子类的方法 ，子类方法中super调用父类的方法 ，执行父类中的方法。
//		bg.setColor("blank");
		bg.shoeThis();
		System.out.println(bg.getColor());
		
		About_This at = new About_This();
		at.name = "zhangs";
		
		About_This bt = new About_This();
		bt.name = "李四";
		
		at.myName();
		bt.myName();
		
		RunCar rc = new RunCar();
		rc.speed();
		
		bg.speed();*/
		RunCar rc = new RunCar();
		
		
		Sunny sun = new Sunny();
		RainDay rd = new RainDay();
		
		sun.description();
		rd.description();
		
	//  Weather w = new Weather() ; // Cannot instantiate the type Weather
//		Person p = new Person();  // Cannot instantiate the type Weather
	}
}
