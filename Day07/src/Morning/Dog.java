package Morning;

public class Dog {
	private String name;
	private int age ;
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Ĭ�Ϲ��췽����û�й��췽��ʱ�Զ����ɡ�");
	}

	public Dog(String name) {
		super();
		this.name = name;
		System.out.println("���Ǵ������Ĺ��췽��������ֵΪ��" + name );
	}
	
	public Dog(String name ,int  age) {
		
	}
	public Dog(int age , String name) {
		
	}
	
	/*
	 * ����������
	 */
	public void eatBone() {
		System.out.println("�Թ�ͷ");
	}
	
	//Duplicate method eatBone() in type Dog
//	public String eatBone() {
//		return "��ͷ";
//	}
	 
	public void eatBone(String bone) {
		System.out.println("�ԣ�" + bone);
		
	}
}
