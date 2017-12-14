package Homework;

public class TV {
	private String brank;
	private double price ;
	private double size ;
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
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	void use() {
		System.out.println("用来打发时间。");
	}
	void use(String electric) {
		System.out.println("使用的电是：" + electric);
	}
	String getImage() {
		return "已开机";
	}
	String open (String  control) {
		return "使用" + control + "开机";
	}
}
