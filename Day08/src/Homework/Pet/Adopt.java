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
	
	//��������������
	public Pet adoptPet() {
		Pet pet = this.pet;
		Scanner input = new Scanner(System.in);
		System.out.println("������������ƣ�");
		if (input.hasNext()) {
			pet.setName(input.next());
		}
		System.out.println("��ѡ��������ͣ������Ӧ���֣���\n 1������\r2�����");
		if (input.hasNextInt()) {
			if (input.nextInt() == 1) {
				System.out.println("��ѡ�񹷹�Ʒ�֣�\n1����������������Ȯ \t2������ѩ����");
				if (input.hasNextInt()) {
					if (input.nextInt() == 1) {
						pet.setRace("��������������Ȯ");
					}
					else if (input.nextInt() == 2) {
						pet.setRace("����ѩ����");
					}
					else {
						System.out.println("������󣡣���");
						return null;
					}
				}
			}
			else if (input.nextInt() == 2) {
				System.out.println("��ѡ��������֣�\n1�� Q��\t2��Q��");
				if (input.hasNextInt()) {
					if (input.nextInt() == 1) {
						pet.setGander("Q��");
					}
					else if (input.nextInt() == 2) {
						pet.setGander("Q��");
					}
				}
			}
			else {
				System.out.println("������󣡣���");
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
