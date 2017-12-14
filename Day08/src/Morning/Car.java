package Morning;

public class Car {
	private String brank;
	private double price;
	private String color;
	private int wheels;

	public String getBrank() {
		return brank;
	}

	public void setBrank(String brank) {
		this.brank = brank;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		System.out.println("----我是父类中的setColor   " + color + "	当前类类型：" + this.getClass().getName());
	}
	
	public void speed() {
		System.out.print("这辆车加速了！！");
	}
}
