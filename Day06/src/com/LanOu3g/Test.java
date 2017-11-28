package com.LanOu3g;

import Morning.About_Method;

public class Test {
	public static void main(String[] args) {
		About_Method am = new About_Method ();
		//The method angry() from the type About_Method is not visible
		// 即，只能在本包中访问
//		am.angry();
		// 默认是同包使用
//		am.love();
	}
}
