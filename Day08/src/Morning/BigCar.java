package Morning;

public class BigCar extends Car {
	// ���������е����Խг�Ա����
	// �����ڷ����еĽоֲ�����
	private String name = "�󿨳�";
			
	public void show() {
		// ��Ϊ˽�У������޷����ʣ�Ҳ���޷���ֵ��
		//wheels = 4 ;
		int w = getWheels();
		System.out.println("��̥����" + w);
		
	}
	public void pullGoods() {
		System.out.println("���� ȥ�ˣ���");
	}
	
	public void shoeThis() {
		this.setColor("�������ú�ɫ");
		super.setColor("����������ɫ");
	}
	
	/****************����Ϊ����ķ���***************/
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
		 System.out.println("���������е�setColor  " + color  + "	��ǰ�����ͣ�" + this.getClass().getName());
		super.setColor(color);
	}
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		super.speed();
		System.out.println("���ٶ�Ϊ80.");
	}
	
	
}
