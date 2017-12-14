package FirstHomework;

public class Test {
	public static void main(String[] args) {
		String str = new String ("zhangs");
		int a = 10 ;
		System.out.println("Person 类");
		Person zhangs = new Person("庄周", 18);
		zhangs.walk();
		System.out.println(a);
		System.out.println(zhangs); // 地址： 内存里的   Homework.Person@   15db9742 ++> 十六进制 
		
		System.out.println("Woman 类");
		Woman w = new Woman();
		w.walk();
		
		System.out.println(" Man 类");
		Man m = new Man();
		m.weight();
		m.walk();
		m.work();
		
		System.out.println("Teacher类");
		Teacher t = new Teacher();
		t.walk();
		t.work();
	}
}
