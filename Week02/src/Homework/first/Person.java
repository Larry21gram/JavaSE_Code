package Homework.first;
//5，创建一个类Person，类中有姓名，用户名，密码，职业四个属性，及其set/get方法 四种职业类型都继承Person。
public class Person {
	private static Person[] info;
	// 姓名 用户名 密码 职业
	private String name;
	private String user;
	private int passworld;
	private String job;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getPassworld() {
		return passworld;
	}

	public void setPassworld(int passworld) {
		this.passworld = passworld;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Person(String name, String user, int passworld, String job) {
		super();
		this.name = name;
		this.user = user;
		this.passworld = passworld;
		this.job = job;
	}
	
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	public Person() {
		super();
	}
	
	@Override
	public String toString() {
		return "姓名：" + name + ", 职业：" + job ;
	}
	
	public static void print() {
		System.out.println("姓名\t用户名\t\t密码\t职业");
		for (int i = 0; i < info.length; i++) {
			if (info[i] != null) {
				System.out.println(info[i].name+ "\t" + info[i].user 
						+ "\t" + info[i].passworld + "\t" + info[i].job);
			}
		}
	}

	public static Person[] getInfo() {
		return info;
	}

	public static void setInfo(Person[] info) {
		Person.info = info;
	}
	
	public static void main(String[] args) {
		System.out.println("woni");
	}
}
