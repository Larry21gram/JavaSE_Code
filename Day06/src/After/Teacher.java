package After;

public class Teacher {
	// ��ɫnameΪ���� ����ɫnameΪ���� 
	private String name;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Teacher(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public Teacher() {
		super();
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", gender=" + gender + "]";
	}

}
