package Afternoon;

public class Monkey extends Animal {
	private String name;

	public Monkey() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("��������Ҳ������");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		// ���ø����sleep����
		System.out.println("���Ǻ��ӵ�˯������������");
		super.sleep();
	}

}
