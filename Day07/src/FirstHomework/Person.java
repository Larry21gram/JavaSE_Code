package FirstHomework;

public class Person {
	//Person类有两个属性，两个方法
	private String name ;
	private int age;
	private Math a ;
	
	void work() {
		System.out.println("Person 的工作方法");
	}
	void walk() {
		System.out.println("父类的行走方法！！");
	}
	// 构造方法： 只能拿来创建Person 类的实例对象
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
