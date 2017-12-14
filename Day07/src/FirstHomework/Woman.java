package FirstHomework;

public class Woman extends Person {
	
	private final String gander = "woman";

	public String getGander() {
		return gander;
	}
	
	public Woman() {
		System.out.println("Woman 的构造方法！！！");
	}
	
	void cook() {
		System.out.println("Woman 的做饭方法！！！");
	}
}
