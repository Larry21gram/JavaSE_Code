package MOrning.interfaces;

import MOrning.Polymorphic.Doctor;
import MOrning.Polymorphic.Teacher;

public class Test {
	public static void main(String[] args) {
		// 对象名为 wd 
		WatchDog wd = new WatchDog();
		Work w = wd;
		Company facebook = new Company();
		
		// 传入参数是什么？	
		facebook.setWork(new WatchDog());
		facebook.work();
		facebook.endWork();
		
		facebook.setWork(new Doctor());
		facebook.work();
		facebook.endWork();
		
		facebook.setWork(new Teacher());
		facebook.work();
		facebook.endWork();
	}
}
