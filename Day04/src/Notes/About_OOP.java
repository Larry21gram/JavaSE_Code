package Notes;
/*
 * 面向对象
 * 类 
 * 类型是事物的抽象
 * 对象是事物的实例
 * 
 * 生活中的信息--- 》 类的属性
 * 生活中的动作 --- 》 类的方法
 * 
 * 实例化对象
 * new 关键字 。
 * 
 * 
 * 属性初始化顺序： 默认 、 显示 、构造块 、 构造方法
 */
public class About_OOP {
	public static void main(String[] args) {
		// 实例化对象。如下：
		// Car 是类 
		// c  是对象。是根据Car 创建出来的。
		Car c = new Car();
		// 对象使用方法
//		c.show();
		Car c2 = new Car();
		//比较地址
		System.out.println(c == c2);
		// 传递引用地址
		Car c3 = c2 ;
		System.out.println(c3 == c2);
		
		// 检验初始化值：
		System.out.println(new Trees());
		System.out.println(new Trees().f);
		System.out.println(new Trees().l);
	}
}
 
class Car {
	/*
	 * 现实生活中的车
	 * 可以加速 减速 转弯
	 * 有车牌 重量 生产商等
	 * 
	 * 在Java中，可以创建一个类表示car
	 * 那么 用属性表示静态特点
	 * 方法表示功能
	 * 
	 * 因此  获得了car 的编程世界中的类 
	 * 
	 * 
	 */
	// 车牌
	String mark;
	// 厂商 
	String Manufacturer ;
	//颜色
	String color = "red";
	
	public void drive () {
		System.out.println("老司机开车啦！！！");
	}   
	//  show 是类中的行为， 类的对象共有的行为， Java中称之为方法。
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("车牌号是：" + mark + " | 颜色是：" + color);
	}
}

class Trees{
	private String name ;
	private double high;
	private String loc;
	float f ;
	long  l ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Trees(String name, double high, String loc) {
		super();
		this.name = name;
		this.high = high;
		this.loc = loc;
	}
	public Trees() {
		super();
	}
	@Override
	public String toString() {
		return "Trees [name=" + name + ", high=" + high + ", loc=" + loc + "]";
	}
	
	
}
