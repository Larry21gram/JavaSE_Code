package Practice;

public class About_Method {
	public static void main(String[] args) {
		// ���еĴ����Ϊ����顣��ʵ��������ʱ ���Զ����е���
		//��̬�����ڹ����ִ��
		Code c = new Code();

		//c.print();
	}
}

class Code {
	
	static {
		System.out.println("���о�̬�飡����");
	}
	
	{
		System.out.println("���� ����飡��");
	}

	public void print() {
		System.out.println("�����е� ����飡����");
	}
}
