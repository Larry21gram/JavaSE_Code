package Homework.Pet;

import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) {
		/*
		 *  1、 控制台提示输入宠物名称
			2、根据控制台提示，选择领养宠物类型：狗狗或企鹅
			3、如果是狗狗： 俩品种：聪明的拉布拉多犬 或 酷酷的雪纳瑞
			4、切： 选择企鹅姓名： Q仔、Q妹
			5、亲密度 ： 默认为0 ；
			6、输出宠物信息：昵称 、健康值 、亲密度、 品种或类别  。 表示领养成功。

		 */
		Pet pet = new Pet();
		Adopt ad = new Adopt();
		ad.setPet(pet);
		System.out.println(ad);
		Pet petCopy = ad.adoptPet();
		System.out.println(petCopy);
	}
}
