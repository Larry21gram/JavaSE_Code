package FirstHomework;

public class Test {
	public static void main(String[] args) {
		String str = new String ("zhangs");
		int a = 10 ;
		System.out.println("Person ��");
		Person zhangs = new Person("ׯ��", 18);
		zhangs.walk();
		System.out.println(a);
		System.out.println(zhangs); // ��ַ�� �ڴ����   Homework.Person@   15db9742 ++> ʮ������ 
		
		System.out.println("Woman ��");
		Woman w = new Woman();
		w.walk();
		
		System.out.println(" Man ��");
		Man m = new Man();
		m.weight();
		m.walk();
		m.work();
		
		System.out.println("Teacher��");
		Teacher t = new Teacher();
		t.walk();
		t.work();
	}
}
