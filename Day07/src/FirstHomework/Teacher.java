package FirstHomework;

public class Teacher extends Person {
	private String job = "��ʦ";

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	void teach() {
		System.out.println("Teacher�Ľ��鷽��");
	}
}
