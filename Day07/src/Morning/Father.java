package Morning;

public class Father {
	private String name;
	private int age;
	private double salary;
	// ���� �� ����
	private Wife wife;
	private Child child;

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

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "Father [������" + name + ", ���ţ�" + wife.toString() + ", ���ӣ�" + child.toString()+ "]";
	}

}
