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
		System.out.println("������ʱ�䡣");
	}
	void use(String electric) {
		System.out.println("ʹ�õĵ��ǣ�" + electric);
	}
	String getImage() {
		return "�ѿ���";
	}
	String open (String  control) {
		return "ʹ��" + control + "����";
	}
}
