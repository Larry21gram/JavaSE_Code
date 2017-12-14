package Morning;
	/*
	 * 抽象类 ：没有具体对象的类
	 * abstract 
	 * 关键字 ，用于声明抽象类
	 * 		抽象是一种思维过程
	 * 
	 * 特点： 不能通过new实例化对象
	 */
public abstract class Weather {
	public void show() {
		
	}
	// 抽象方法： 没有方法体 并用abstract 关键字修饰
	public abstract void showAbstract();
	
	public abstract void  description();
}
