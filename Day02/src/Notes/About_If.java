package Notes;
	/*
	 * if （条件） ｛
	 * 		条件成立时执行
	 * ｝
	 * else {
	 * 		条件不成立是执行
	 * }
	 * 
	 * if (条件1 ) {
	 * 		条件一成立时执行
	 * }
	 * else if(条件2 ) {
	 *  	条件2 成立时执行
	 * }
	 * 
	 * 
	 * 条件    
	 * 
	 * 逻辑运算符 
	 * 
	 * &&  与                   || 或                           ！ 非                   ^ 异或  
	 * 
	 * &&  和  & 的区别 ： && 有阻断 功能    & 没有 
	 * 
	 * || 和 |   的区别： || 有阻断 功能   |　没有
	 * 
	 * 位运算 
	 * &  有0 则0 
	 * | 有1 则1 
	 * ^ 相同则0 ，不同则  1
	 * 26   11010 
	 * 23 	10111
	 * ^    01101  1 + 4 + 8 = 13
	 */
public class About_If {
	public static void main(String[] args) {
	/*	//定义Java成绩
		int javaScore = 89;
		if (javaScore > 90) {
			System.out.println("A");
		}
		else if (javaScore > 80) {
			System.out.println("B");
		}
		else if (javaScore > 70) {
			System.out.println("C");
		}
		else if (javaScore > 60 ) {
			System.out.println("D");
		}
		else {
			System.out.println("不及格，需要进行重新学习！！");
		}
		
		if (javaScore < 60 ) {
			System.out.println("gg 了 ，兄弟。");
		} 
		// java 初级课程大于 85 ，中级课程大于 80 才能 进行下阶段学习。否则重修。
		
		if (javaScore > 80 && javaScore < 100) {
			//javaScore 即大于80 又小于 100 时 执行语句 
			System.out.println("兄弟 ，加油了！！！");
		}
		
		
		if (javaScore > 80 || javaScore < 100) {
			// 只要有一个为false就执行
			System.out.println("要吗是天才，要么笨蛋。");
		}
		
		if (!(javaScore < 60)) {
			//  ! 取反       !true  <=> false 
			System.out.println("!(javaScore < 60):" + !(javaScore < 60));
		}*/
		// 交换俩变量值
	/*	int a = 10 ;
		int b = 20 ;
		// 方式一
		int temp = a ;
		 a = b ;
		 b = temp ;
		 System.out.println(" a: " + a  + " b : " + b);
		 
		 //方式二 
		  a = a ^ b ;
		  b = a ^ b ;
		  a = a ^ b ;
		  System.out.println(" a: " + a  + " b : " + b);
		  
		  //方法三 
		  a  = a + b ;
		  b = a - b ;
		  a = a - b ;
		  System.out.println(" a: " + a  + " b : " + b);*/
		
		int score = 80;
		if (score >= 80) {
			System.out.println("良好");
		}
		else if (score >= 60 ) {
			System.out.println("中等");
		}
		else  {
			System.out.println("差");
		}
		
		double time = 9;
		String gender = "man";
		if (time < 10  ) {
			System.out.println("进决赛！！！");
			if (gender == "man") {
				System.out.println("进男子组");
			}
			else if(gender == "woman"){
				System.out.println("进女子组");
			}
		}
		else {
			System.out.println("pass");
		}
	}
}
