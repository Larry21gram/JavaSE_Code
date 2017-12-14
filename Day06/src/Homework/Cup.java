package Homework;

public class Cup {
	private String brank;
	private int price ;
	private double weiht;
	public String getBrank() {
		return brank;
	}
	public void setBrank(String brank) {
		this.brank = brank;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeiht() {
		return weiht;
	}
	public void setWeiht(double weiht) {
		this.weiht = weiht;
	}
	
	void  decorate () {
		System.out.println("装饰");
	}
	void destroy(String tool) {
		System.out.println("被" + tool + "毁坏了");
	}
	String use() {
		return "空杯子";
	}
	String use (String water) {
		return "装了：" + water;
	}
}
