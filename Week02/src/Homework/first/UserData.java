package Homework.first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Homework.second.UserInter;

public class UserData {
	
	/*
	 * 1������һ��UserData�࣬ͨ����ά����洢�������û��������룬ְҵ�ĸ���Ϣ��
	����		�û���		����			ְҵ
	����		zhangSan	111111		Worker
	����		liSi666		222222		Doctor
	����		wangWu888	333333		Cooker
	����		zhaoLiu999	444444		Boss
	*/
	public static String [] [] info = {{"����","zhangSan","111111","Worker"} ,
								{"����","liSi666","222222","Doctor"} , 
								{"����","wangWu888","333333","Cooker"} ,
								{"����","zhaoLiu999","444444","Boss"} };
	
	public static void print() {
		System.out.println("����"+ "\t�û���"+"\t\t����"+"\tְҵ");
		for (int i = 0; i < info.length; i++) {
			for (int j = 0; j < info[i].length; j++) {
				System.out.print(info[i][j] + " \t");
			}
			System.out.println();
		}
	}
	//��������Ϊ��Ա����
	public static List<UserInter> list = new ArrayList<UserInter>();
	
	public void setList(String name, String user, int passworld, String job) {
		list.addAll((Collection<? extends UserInter>) new Person(name,user,passworld,job));
	}

	public List getList() {
		return list;
	}

}