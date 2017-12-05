package MOrning.interfaces;

/**
 * implements
 * 关键字： 实现WatchDog与Work关联，于是WatchDog满足Work的规范。
 * @author lanou
 *
 */
public class WatchDog implements Work {

	@Override
	public void work() {
		
		// TODO Auto-generated method stub.
		System.out.println("看门！！！");
	}

	@Override
	public void goHome() {
		// TODO Auto-generated method stub
		System.out.println("回窝了！！！！");
	}
	
}
