package Homework.Pet;

import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) {
		/*
		 *  1�� ����̨��ʾ�����������
			2�����ݿ���̨��ʾ��ѡ�������������ͣ����������
			3������ǹ����� ��Ʒ�֣���������������Ȯ �� ����ѩ����
			4���У� ѡ����������� Q�С�Q��
			5�����ܶ� �� Ĭ��Ϊ0 ��
			6�����������Ϣ���ǳ� ������ֵ �����ܶȡ� Ʒ�ֻ����  �� ��ʾ�����ɹ���

		 */
		Pet pet = new Pet();
		Adopt ad = new Adopt();
		ad.setPet(pet);
		System.out.println(ad);
		Pet petCopy = ad.adoptPet();
		System.out.println(petCopy);
	}
}
