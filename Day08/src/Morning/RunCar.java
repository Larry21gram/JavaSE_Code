package Morning;

public class RunCar extends Car {

	/*
	 * ��д�����speed����
	 */
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		super.speed();
		System.out.println("�ܳ����죡������");
	}
	// @Override // �����ʾ���Ǹ���̳еġ�������Ϊ����ʾ�Ƿ�Ӹ���̳�
	public void pua() {
		System.out.println("��߸�������������");
	}
	public void look() {
		super.setWheels(20);
	}
}
