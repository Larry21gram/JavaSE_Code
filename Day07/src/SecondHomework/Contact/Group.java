package SecondHomework.Contact;

import java.util.Arrays;

public class Group {
	private String name;
	// 每个分组长度为十 
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
	
	@Override// 访问Group里的所有联系人
	public String toString() {
		return "Group [name=" + name  + Arrays.toString(group) + "]";

	}
	
	// 向分组中添加联系人
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
			System.out.println("本分组人已满！！！");
		}
	}
}
