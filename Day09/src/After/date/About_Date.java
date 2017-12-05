package After.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class About_Date {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
//		System.out.println(new About_Date());
		
		System.out.println(System.currentTimeMillis());
		long l = System.currentTimeMillis();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = df.format(l);
		System.out.println(str);
		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("我调用了这个类的toStirng方法");
		return super.toString();
	}
	
}
