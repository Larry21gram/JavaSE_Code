package Morning;

public class BigCar extends Car {
	// 定义在类中的属性叫成员变量
	// 定义在方法中的叫局部变量
	private String name = "大卡车";
			
	public void show() {
		// 因为私有，所以无法访问，也就无法赋值。
		//wheels = 4 ;
		int w = getWheels();
		System.out.println("轮胎个数" + w);
		
	}
	public void pullGoods() {
		System.out.println("拉货 去了！！");
	}
	
	public void shoeThis() {
		this.setColor("子类设置黑色");
		super.setColor("父类设置绿色");
	}
	
	/****************以下为父类的方法***************/
	@Override
	public String getBrank() {
		// TODO Auto-generated method stub
		return super.getBrank();
	}
	@Override
	public void setBrank(String brank) {
		// TODO Auto-generated method stub
		super.setBrank(brank);
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}
	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		super.setPrice(price);
	}
	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return super.getWheels();
	}
	@Override
	public void setWheels(int wheels) {
		// TODO Auto-generated method stub
		super.setWheels(wheels);
	}
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		 System.out.println("我是子类中的setColor  " + color  + "	当前类类型：" + this.getClass().getName());
		super.setColor(color);
	}
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		super.speed();
		System.out.println("加速度为80.");
	}
	
	
}
