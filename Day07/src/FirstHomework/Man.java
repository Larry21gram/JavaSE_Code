package FirstHomework;

public class Man extends Person {
	//子类有自己独有的属性和方法（个数任意）
	private final String gander = "man";

	public String getGander() {
		return gander;
	}
	
	void  weight() {
		System.out.println("一般时间下男人比女人重");
	}
}
