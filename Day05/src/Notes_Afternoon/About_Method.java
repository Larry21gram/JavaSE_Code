package Notes_Afternoon;

public class About_Method {
	// main �����ǳ��������ڡ� Java����ʱ�����￪ʼ��
	public static void main (String [] args) {
		/* �������
		 * �����ڴ�����������ʹ�á�
		 */
		Father f = new Father();
		f.setName("Сͷ�ְ�");
//		System.out.println(f);
		
		// ������ . ���� �����ñ��������ڶ���ķ�����
		//System.out.println(f.getName());
		
		//Student
		Student stu = new Student () ;
		// ���������Ը�ֵ������ʾ��ֵ��
		stu.setName("С��");
		stu.setSchool("Ұ����ѧ������");
		// ������÷��� �������� .��������
		stu.play();
		stu.study();
		System.out.println(stu.getName());
		
		stu.buyFoot(50);
		stu.add(10, 12);
		String str = stu.hot("����");
		System.out.println(str);
	} 
}
