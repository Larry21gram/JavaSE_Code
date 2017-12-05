package MOrning.Polymorphic;

public class Company2 {
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
/*	public void work () {
		this.person.work();
	}*/
	
	public void work() {
		if (person instanceof Teacher ) {
			System.out.println("这是老师！！");
		}
		if (person instanceof Doctor ) {
			System.out.println("只是医生！！！");
		}
		if (person instanceof Student ) {
			System.out.println("这是学生！！！");
		}
	}
	
}
