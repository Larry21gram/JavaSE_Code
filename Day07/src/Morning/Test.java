package Morning;

public class Test {
	public static void main(String[] args) {

//		Father ft = new Father();
//		Mother mt = new Mother();
//		Wife w = new Wife();
//		Child ch = new Child();
//
//		ft.setName("wangw");
//		ft.setChild(ch);
//		ft.setWife(w);
//
//		ch.setName("xiaom");
//		ch.setFather(ft);
//		ch.setMother(mt);
//
//		mt.setChild(ch);
//		mt.setFather(ft);
//		mt.setName("白洁");
//
//		w.setChild(ch);
//		w.setFather(ft);
//		w.setName("白浅");
//
//		System.out.println(ft);
//		System.out.println(ch);
//		System.out.println(mt);
//		System.out.println(w);

		// ����һ��������˼�ǣ� ���ñ������Ĺ��췽��Cat() �����һ��������� new Cat() ,�˶����ֵַ���� cat ;
/*		Cat cat = new Cat();

		//
		cat.setName("Tom");

		Person owner = new Person();
		owner.setName("��ʺ��");

		cat.setOwner(owner);

		System.out.println(cat);
*/
		/*
		 * ÿ��è�ڴ�������ʱ�����˾��Ѿ����ˡ� �����ڴ���ʱ�������ˣ�����ͬèһ�𴴽������� ����ֱ���޸Ĺ��췽����
		 * 
		 */
		Dog d = new Dog();
		Dog dd = new Dog("���ƣ�����");
	}
}

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}