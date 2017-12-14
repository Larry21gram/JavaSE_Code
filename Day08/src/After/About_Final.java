package After;

public class About_Final {
	final int AGE = 20 ;
	public final void show() {
		
		System.out.println("show");
	}
	// final 修饰的属性只有get方法
	public int getAGE() {
		return AGE;
	}
}
