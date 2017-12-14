package Afternoon;

public class Monkey extends Animal {
	private String name;

	public Monkey() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("俺老孙来也！！！");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		// 调用父类的sleep方法
		System.out.println("我是猴子的睡觉方法！！！");
		super.sleep();
	}

}
