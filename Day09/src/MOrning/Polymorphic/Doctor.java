package MOrning.Polymorphic;

import MOrning.interfaces.Serch;
import MOrning.interfaces.Work;

public class Doctor extends Person implements Work , Serch{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		super.work();
		System.out.println("�о��о����Ͳ���");
	}

	@Override
	public void goHome() {
		// TODO Auto-generated method stub
		System.out.println("�ؼ��ˣ�����");
	}

}
