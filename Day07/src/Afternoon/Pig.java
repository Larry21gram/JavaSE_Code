package Afternoon;

public class Pig extends Animal {
	private int num ;

	public Pig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pig(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	// 子类定义自己独特的方法 ，叫扩展。
	public void beKill() {
		System.out.println("被杀掉了。");
	}

	@Override
	public String toString() {
		return "Pig [num=" + num + ", getRace()=" + getRace() + "]";
	}
	
}
