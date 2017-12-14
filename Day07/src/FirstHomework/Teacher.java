package FirstHomework;

public class Teacher extends Person {
	private String job = "教师";

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	void teach() {
		System.out.println("Teacher的教书方法");
	}
}
