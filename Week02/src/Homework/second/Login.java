package Homework.second;

import Homework.first.UserData;

public class Login {
	static String [][] infos = UserData.info;
	//����һ��Login�࣬�����е�¼����������һ���û��������룬����һ��
	public static UserInter matching (String user , String passworld) {
		if (user != null && passworld != null) {
			for (int i = 0; i < infos.length; i++) {
				for (int j = 0; j < infos[i].length - 1; j++) {
//					System.out.println(infos[i][j]);
					// �ж��Ƿ�ƥ��
					if (infos[i][j].equals(user) && infos[i][j + 1].equals(passworld)) {
						switch (infos[i][infos[i].length - 1]) {
						case "Worker":
							return new Worker(infos[i][0],infos[i][infos[i].length - 1]);
						case "Doctor":
							return new Doctor(infos[i][0],infos[i][infos[i].length - 1]);
						case "Cooker":
							return new Cooker(infos[i][0],infos[i][infos[i].length - 1]);
						case "Boss"  :
							return new Boss(infos[i][0],infos[i][infos[i].length - 1]) ;
						default:
							System.out.println("��Ϣ���󣡣���");
							return null ;
						}
					}
				}
			}
			System.out.println("��Ϣ���󣡣���");
		}
		return null ;
	}
	
	//����һ��Login�࣬�����е�¼����������һ���û��������룬����һ��
	public static UserInter match (String user , int passworld) {
		if (user != null ) {
			for (int i = 0; i < UserData.list.size(); i++) {
				if (!UserData.list.isEmpty()) {
					switch (UserData.list.get(i).getClass().getSimpleName()) {
					case "Worker":
						Worker w = (Worker) UserData.list.get(i);
						if (w.getUser().equals(user) && w.getPassworld() == passworld) {
							return UserData.list.get(i);
						}
					case "Doctor":
						Doctor d = (Doctor) UserData.list.get(i);
						if (d.getUser().equals(user) && d.getPassworld() == passworld) {							
							return UserData.list.get(i);
						}
					case "Cooker":
						Cooker c = (Cooker) UserData.list.get(i);
						if (c.getUser().equals(user) && c.getPassworld() == passworld) {							
							return UserData.list.get(i);
						}
					case "Boss":
						Boss b = (Boss) UserData.list.get(i);
						if (b.getUser().equals(user) && b.getPassworld() == passworld) {							
							return UserData.list.get(i);
						}
					default:
						System.out.println("������");
						break;
					}
				}
			}
		}
		return null;
	}
}