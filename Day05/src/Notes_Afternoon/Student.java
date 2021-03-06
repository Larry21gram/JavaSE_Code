package Notes_Afternoon;

public class Student {

	private String name;
	private String school;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student(String name, String school, int id) {
		super();
		this.name = name;
		this.school = school;
		this.id = id;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", school=" + school + ", id=" + id + "]";
	}

	public void play() {
		System.out.println(name + "召唤师峡谷一日游！！！");
	}

	public void study() {
		System.out.println(name + "在上学，学校是：" + school);
	}
	
	/*public 权限修饰符
	 * void 返回值 void 表示没有返回值 。
	 * show 方法名
	 * (String str) 参数列表 String 为参数类型  str为形参名 （见名知意即可） 注： 调用时需要传入对应类型的参数内容 
	 * {}  方法体 当方法被调用时执行的代码
	 * 
	 */
	public void show(String str) {
		
	}
	
	public void buyFoot(int  money) {
		System.out.println("拿着老师的钱" + money + "打游戏去了");
	}
	
	// 中学生具备加法运算能力
	public int add (int a , int b ) {
		System.out.println("和为：" + (a + b));
		return a + b ;
	} 
	
	public String hot (String str) {
		// String 表示返回值为字符串 
		return str + "加热！！！";
	}
}
