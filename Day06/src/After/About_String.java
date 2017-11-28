package After;
/*
 * 字符串
 */
public class About_String {
	public static void main(String[] args) {
		/*
		 * String 类
		 * 字符串自声明之后即为常量 ，不可改变。
		 */
		String str1 = "zhangs";
		String str2 = "zhangs";
		String str3 = new String("zhangs");
		String str4 = new String("zhangs");
		//字符串在赋值时先查找是否存在该值，如果有直接赋地址值
		System.out.println("str1 = str2：" + (str1 == str2));
		// 如果是new出来的对象，即每个对象不一样的地址值。
		System.out.println("str3 == str4 :" + (str3 == str4));
		// equals 判断内容是否相等
		System.out.println("str3.equals(str4):" + str3.equals(str4));
	}
}
