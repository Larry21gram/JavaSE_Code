package Afternoon;

public class Pig extends Animal {
	private int num ;

	public Pig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pig(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	// ���ඨ���Լ����صķ��� ������չ��
	public void beKill() {
		System.out.println("��ɱ���ˡ�");
	}

	@Override
	public String toString() {
		return "Pig [num=" + num + ", getRace()=" + getRace() + "]";
	}
	
}
