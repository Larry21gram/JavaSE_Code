package MOrning.Polymorphic;

import MOrning.interfaces.Work;

public class Teacher extends Person implements Work {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		super.work();
		System.out.println("�̽��顣");
	}

	@Override
	public void goHome() {
		// TODO Auto-generated method stub
		System.out.println("�ؼ�����ˣ�����");
	}
	
}
