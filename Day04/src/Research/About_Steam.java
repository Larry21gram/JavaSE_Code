package Research;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class About_Steam {
	public static void main(String[] args) throws IOException {
		// 获得一个绑定到控制台的字符流 接受输入的数据。
		
		// BufferedReader 在完成一个输入任务后关闭的特性可以使其运用到接受一系列数据，直到接受完自动关闭输入流。
		BufferedReader br = new BufferedReader(new 
							InputStreamReader(System.in));
		System.out.println("输入“q”退出！！！");
		char c ;
		do {
			c = (char) br.read();
			System.out.println(c + "abc");
		}while (c != 'q');
		// 当上面成立后则关闭输入
		
		String str = br.readLine();
		System.out.println(str);
		char cc = (char) br.read();
		System.out.println(cc);
		br.close();
//		br.close();
		System.out.println("关闭了");
		byte [] b = {'w','o','a','i','n','i'};
		System.out.write(b);
		//
	}
}
