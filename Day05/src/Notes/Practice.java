package Notes;

public class Practice {
	public static void main(String[] args) {
		Father f = new Father();
		Mother m = new Mother();
		Child c = new Child();
		System.out.println(f);
		System.out.println(m);
		System.out.println(c);
	}
}

// father
class Father {
	private String name;
	private int age ;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Father(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Father() {
		super();
	}
	@Override
	public String toString() {
		return "Father [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}

// mather 
class Mother {
	private String name ;
	private int age ;
	private String chefsRecommendation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getChefsRecommendation() {
		return chefsRecommendation;
	}
	public void setChefsRecommendation(String chefsRecommendation) {
		this.chefsRecommendation = chefsRecommendation;
	}
	public Mother(String name, int age, String chefsRecommendation) {
		super();
		this.name = name;
		this.age = age;
		this.chefsRecommendation = chefsRecommendation;
	}
	public Mother() {
		super();
	}
	@Override
	public String toString() {
		return "Mother [name=" + name + ", age=" + age + ", chefsRecommendation=" + chefsRecommendation + "]";
	}
	
} 

class Child{
	private String name ;
	private String school;
	private String girlFriend;
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
	public String getGirlFriend() {
		return girlFriend;
	}
	public void setGirlFriend(String girlFriend) {
		this.girlFriend = girlFriend;
	}
	public Child(String name, String school, String girlFriend) {
		super();
		this.name = name;
		this.school = school;
		this.girlFriend = girlFriend;
	}
	public Child() {
		super();
	}
	@Override
	public String toString() {
		return "Child [name=" + name + ", school=" + school + ", girlFriend=" + girlFriend + "]";
	}
	
}