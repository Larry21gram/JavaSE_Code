package After.change;

public class Test {
	public static void main(String[] args) {
		Kongfu tw = new Taekwondo();
		// 父类引用只能使用子类中父类继承的方法。 以及父类的方法。没有子类独有的方法。
		// 此时只能看到父类有的方法。
		tw.prepare();

		tw = new Boxing();

		tw.prepare();
		
		if (tw instanceof Boxing) {
			//强制类型转换。
			Boxing box = (Boxing) tw;
			box.stregth();
		}
		
		// .ClassCastException
		//Taekwondo tt = (Taekwondo) tw; 
	}
}
