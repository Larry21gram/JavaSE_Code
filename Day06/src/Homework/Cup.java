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
		System.out.println("װ��");
	}
	void destroy(String tool) {
		System.out.println("��" + tool + "�ٻ���");
	}
	String use() {
		return "�ձ���";
	}
	String use (String water) {
		return "װ�ˣ�" + water;
	}
}
