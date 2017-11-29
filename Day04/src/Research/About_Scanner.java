package Research;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class About_Scanner {
	public static void main(String[] args) {
		/* Scanner input = new Scanner(System.in);
		 int test = 0;
		 System.out.println("请输入整数：");
		 if (input.hasNextInt()) {
			test = input.nextInt();
		}
		 else {
			 System.out.println("输入不是整数");
		 }
		 System.out.println("" + test);*/
		
		String str = "125665safdfg56a22132";
		Pattern pt = Pattern.compile("\\d");
		Matcher m = pt.matcher(str);
		while(m.find()) {
			System.out.print(" " + m.group());
		}
//		System.out.println(pt.pattern());
	}
}
