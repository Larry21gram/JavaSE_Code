package Morning;

public class Dog {
	private String name;
	private int age ;
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("默认构造方法《没有构造方法时自动生成》");
	}

	public Dog(String name) {
		super();
		this.name = name;
		System.out.println("这是带参数的构造方法，参数值为：" + name );
	}
	
	public Dog(String name ,int  age) {
		
	}
	public Dog(int age , String name) {
		
	}
	
	/*
	 * 方法的重载
	 */
	public void eatBone() {
		System.out.println("吃骨头");
	}
	
	//Duplicate method eatBone() in type Dog
//	public String eatBone() {
//		return "骨头";
//	}
	 
	public void eatBone(String bone) {
		System.out.println("吃：" + bone);
		
	}
}
