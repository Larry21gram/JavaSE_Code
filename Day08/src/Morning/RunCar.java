package Morning;

public class RunCar extends Car {

	/*
	 * 重写父类的speed方法
	 */
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		super.speed();
		System.out.println("跑车更快！！！！");
	}
	// @Override // 报错表示不是父类继承的。其作用为：表示是否从父类继承
	public void pua() {
		System.out.println("提高个人魅力！！！");
	}
	public void look() {
		super.setWheels(20);
	}
}
