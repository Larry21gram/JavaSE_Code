package SecondHomework.Contact;

import java.util.Arrays;

public class Group {
	private String name;
	// ÿ�����鳤��Ϊʮ 
	private Contact[] group = new Contact[20];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact[] getPersons() {
		return group;
	}

	public void setPersons(Contact[] group) {
		this.group = group;
	}
	
	@Override// ����Group���������ϵ��
	public String toString() {
		return "Group [name=" + name  + Arrays.toString(group) + "]";

	}
	
	// ������������ϵ��
	public void addGroup(Contact person) {
		int i = 0;
		A : for (; i < this.group.length; i++) {
			if (this.group[i] == null) {
				this.group[i] = person;
				break A;
			}
			else {
				continue;
			}
		}
		if (i == this.group.length) {
			System.out.println("������������������");
		}
	}
}
