package Morning;

/*权限修饰符
 * public 共有的
 * private  私有的
 * protected  受保护的（）同包能使用的
 * 默认 默认情况的（同包）
 * 
 * 包 ： package 等同于文件夹
 * Java中即是 类所装的文件夹。
 * 命名： 公司网址的倒置 如 com.LanOu
 * 
 * 返回值类型 表示方法结束返回的类型。
 * 
 * 方法名： 方法的标识
 * 
 * 参数列表：方法执行的必要条件，
 * 
 * 方法体： 方法被调用时，正在执行的代码。
 * 
 * set/get方法自动生成  source 
 */
public class Test {
	public static void main(String[] args) {
		// 这是在声明一个引用	
		About_Method ab;
		// am 是一个
		About_Method am = new About_Method();
		About_Method cm = new About_Method();
		// 这是在传递引用
		ab = am;
		am.smile();
		// 只能在本包中访问
		am.angry();
		// private 只能在本类中访问
		// am.cry();
		String str = am.love();
		System.out.println(str);
		
		System.out.println(am.getName());
		System.out.println(cm.getName());
		
		// 私有化后的属性需要使用本类对象调用方法进行获取和修改
		// 给setName() 方法 所需的参数 ，修改name 属性的值。
		am.setName("爱你一万年");
		System.out.println("改之后： " + am.getName());
	}
}
