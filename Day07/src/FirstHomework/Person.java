package FirstHomework;

public class Person {
	//Person�����������ԣ���������
	private String name ;
	private int age;
	private Math a ;
	
	void work() {
		System.out.println("Person �Ĺ�������");
	}
	void walk() {
		System.out.println("��������߷�������");
	}
	// ���췽���� ֻ����������Person ���ʵ������
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
