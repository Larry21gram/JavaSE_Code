package After;
/*
 * �ַ���
 */
public class About_String {
	public static void main(String[] args) {
		/*
		 * String ��
		 * �ַ���������֮��Ϊ���� �����ɸı䡣
		 */
		String str1 = "zhangs";
		String str2 = "zhangs";
		String str3 = new String("zhangs");
		String str4 = new String("zhangs");
		//�ַ����ڸ�ֵʱ�Ȳ����Ƿ���ڸ�ֵ�������ֱ�Ӹ���ֵַ
		System.out.println("str1 = str2��" + (str1 == str2));
		// �����new�����Ķ��󣬼�ÿ������һ���ĵ�ֵַ��
		System.out.println("str3 == str4 :" + (str3 == str4));
		// equals �ж������Ƿ����
		System.out.println("str3.equals(str4):" + str3.equals(str4));
	}
}
