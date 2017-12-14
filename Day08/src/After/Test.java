package After;

public class Test {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.show();
		
		About_Static as = new About_Static();
		int a = About_Static.score;
		
		as.score = 200;
		System.out.println(a);
		System.out.println(About_Static.score);
		
		About_Static bs = new About_Static();
		bs.show();
		bs.a = 90;
	}
}
