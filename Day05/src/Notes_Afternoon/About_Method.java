package Notes_Afternoon;

public class About_Method {
	// main 方法是程序的主入口。 Java运行时从这里开始。
	public static void main (String [] args) {
		/* 创建类后
		 * 方法在创建对象后才能使用。
		 */
		Father f = new Father();
		f.setName("小头爸爸");
//		System.out.println(f);
		
		// 对象名 . 方法 （调用本类中属于对象的方法）
		//System.out.println(f.getName());
		
		//Student
		Student stu = new Student () ;
		// 给对象属性赋值。（显示赋值）
		stu.setName("小明");
		stu.setSchool("野鸡大学！！！");
		// 对象调用方法 （对象名 .方法名）
		stu.play();
		stu.study();
		System.out.println(stu.getName());
		
		stu.buyFoot(50);
		stu.add(10, 12);
		String str = stu.hot("冷面");
		System.out.println(str);
	} 
}
