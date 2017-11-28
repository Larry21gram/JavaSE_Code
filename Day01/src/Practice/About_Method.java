package Practice;

public class About_Method {
	public static void main(String[] args) {
		// 类中的代码块为构造块。在实例化对象时 会自动进行调用
		//静态块先于构造块执行
		Code c = new Code();

		//c.print();
	}
}

class Code {
	
	static {
		System.out.println("类中静态块！！！");
	}
	
	{
		System.out.println("类中 构造块！！");
	}

	public void print() {
		System.out.println("方法中的 代码块！！！");
	}
}
