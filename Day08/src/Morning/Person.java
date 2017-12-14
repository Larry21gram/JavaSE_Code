package Morning;

public abstract class Person {
	/*
	 * 虽然没有抽象方法，但abstract修饰
	 * 所以是抽象类
	 * 意义： 不可以创建person类对象
	 */
	public void work() {
		System.out.println("工作使我快乐！！");
	}
}
