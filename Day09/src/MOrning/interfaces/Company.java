package MOrning.interfaces;

import MOrning.Polymorphic.Teacher;

public class Company {
	// Work ÊÇ½Ó¿Ú
	private Work work ;

	public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}

	public void work() {
		// TODO Auto-generated method stub
		this.work.work();
	}
	
	public void endWork() {
		this.work.goHome();
	}
	
}
