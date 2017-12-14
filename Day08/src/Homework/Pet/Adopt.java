package Homework.Pet;

import java.util.Scanner;

public class Adopt {
	private Pet pet;

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	//方法：领养方法
	public Pet adoptPet() {
		Pet pet = this.pet;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入宠物名称：");
		if (input.hasNext()) {
			pet.setName(input.next());
		}
		System.out.println("请选择宠物类型（输入对应数字）：\n 1、狗狗\r2、企鹅");
		if (input.hasNextInt()) {
			if (input.nextInt() == 1) {
				System.out.println("请选择狗狗品种：\n1、聪明的拉布拉多犬 \t2、酷酷的雪纳瑞");
				if (input.hasNextInt()) {
					if (input.nextInt() == 1) {
						pet.setRace("聪明的拉布拉多犬");
					}
					else if (input.nextInt() == 2) {
						pet.setRace("酷酷的雪纳瑞");
					}
					else {
						System.out.println("输入错误！！！");
						return null;
					}
				}
			}
			else if (input.nextInt() == 2) {
				System.out.println("请选择企鹅名字：\n1、 Q仔\t2、Q妹");
				if (input.hasNextInt()) {
					if (input.nextInt() == 1) {
						pet.setGander("Q仔");
					}
					else if (input.nextInt() == 2) {
						pet.setGander("Q妹");
					}
				}
			}
			else {
				System.out.println("输入错误！！！");
				return null;
			}
		}
		return pet;
	}

	@Override
	public String toString() {
		if (this.pet != null) {
			return this.pet.toString();
		}
		else {
			return null ;
		}
	}
	
	
}
