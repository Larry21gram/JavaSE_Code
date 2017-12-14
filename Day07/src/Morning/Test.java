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
//		mt.setName("鐧芥磥");
//
//		w.setChild(ch);
//		w.setFather(ft);
//		w.setName("鐧芥祬");
//
//		System.out.println(ft);
//		System.out.println(ch);
//		System.out.println(mt);
//		System.out.println(w);

		// 下面一句语句的意思是： 调用本类对象的构造方法Cat() 构造出一个本类对象 new Cat() ,此对象地址值赋给 cat ;
/*		Cat cat = new Cat();

		//
		cat.setName("Tom");

		Person owner = new Person();
		owner.setName("铲屎官");

		cat.setOwner(owner);

		System.out.println(cat);
*/
		/*
		 * 每个猫在创建出来时，主人就已经有了。 所以在创建时输入主人，再连同猫一起创建出来。 所以直接修改构造方法。
		 * 
		 */
		Dog d = new Dog();
		Dog dd = new Dog("旺财！！！");
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