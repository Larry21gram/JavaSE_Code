package After.change;

public class Test {
	public static void main(String[] args) {
		Kongfu tw = new Taekwondo();
		// ��������ֻ��ʹ�������и���̳еķ����� �Լ�����ķ�����û��������еķ�����
		// ��ʱֻ�ܿ��������еķ�����
		tw.prepare();

		tw = new Boxing();

		tw.prepare();
		
		if (tw instanceof Boxing) {
			//ǿ������ת����
			Boxing box = (Boxing) tw;
			box.stregth();
		}
		
		// .ClassCastException
		//Taekwondo tt = (Taekwondo) tw; 
	}
}
