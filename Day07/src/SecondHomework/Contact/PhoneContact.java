package SecondHomework.Contact;

import java.util.Arrays;

public class PhoneContact{
	// 手机联系人类    封装联系人
	
	private Group[] all = new Group[20];
	
	public Group[] getAll() {
		return all;
	}

	public void setAll(Group[] all) {
		this.all = all;
	}
	//创建分组
	public void addGroup(Group group) {
		for (int i = 0; i < this.all.length; i++) {
			if (this.all [i] == null) {
				this.all[i] = group ;
				break;
			}
			else if(this.all != null) {
				System.out.println("已到分组上限，无法继续创建分组。");
			}
		}
	}
	
	// 给指定分组添加Contact
	public void addContact(Contact person , String name) {
		int i = 0;
		for (; i < this.all.length; i++) {
			if (this.all[i] != null) {
				
				if (this.all[i].getName().equals(name)) {
					this.all[i].addGroup(person);
				}
				else {
					System.out.println("为找到分组！！！");
				}
				
			}
			else {
				continue;
			}
			if (i == this.all.length) {
				System.out.println("未创建分组！！！");
			}
		}
	}
	//展示所有联系人 ： 获得所有联系人  =》 遍历打印
	public void print(PhoneContact ph ) {
		// 
		if (ph != null) {
			System.out.println("所有联系人：{");
			for (int i = 0; i < ph.all.length; i++) {
				//分组有联系人才能输出
				if (ph.all[i] != null) {
					if (ph.all[i].getPersons() != null) {
						for (int j = 0; j < ph.all[i].getPersons().length; j++) {
							if (ph.all[i].getPersons()[j] != null) {
								System.out.println(ph.all[i].getPersons()[j]);
							} else {
								continue;
							}
						}
					}
					else {
						continue;
					}
				}
			}
		}
		System.out.println("******************\t}");
	}
	
	//获取所有女性联系人: 获得　所有联系人　＝> 遍历  => 按性别匹配里联系人，并装入一个数组中 ，返回数组并遍历打印
	public void printWoman() {
		if (this.all != null ) {
			System.out.println("所有女性联系人：{");
			for (int i = 0; i < this.all.length; i++) {
				if (this.all[i] != null) {
					for (int j = 0; j < this.all[i].getPersons().length; j++) {
						if (this.all[i].getPersons()[j] != null && this.all[i].getPersons()[j].getSex() == "woman") {
							System.out.println(this.all[i].getPersons()[j]);
						}
					}
				}
			}
		}
		System.out.println("*****************\t}");
	}
	
	//根据电话号码搜索联系人: 获得所有联系人 =》 遍历所用联系人 =》按号码匹配联系人并返回联系人
	public String lookForPerson(long number) {
		String name = null;
		if (this.all != null ) {
			for (int i = 0; i < this.all.length; i++) {
				if (this.all[i] != null) {
					for (int j = 0; j < this.all[i].getPersons().length; j++) {
						if (this.all[i].getPersons()[j] != null && this.all[i].getPersons()[j].getNumber()== number) {
							name = this.all[i].getPersons()[j].getName();
						}
					}
				}
				
			}
		}
		return name ;
	}
	//获取某个分组下的所有联系人 ： 获得某个分组   =》 遍历打印
	public void printGroup(String groupName) {
		if (this.all != null) {
			System.out.println(groupName + "的联系人如下：{");
			for (int i = 0; i < this.all.length; i++) {
				if (this.all[i] != null && this.all[i].getName().equals(groupName)) {
					for (int j = 0; j < this.all[i].getPersons().length; j++) {
						if (this.all[i].getPersons()[j] !=null) {
							System.out.println(this.all[i].getPersons()[j]);
						}
					}
				}
			}
			System.out.println("**********************\n\t}");
		}
	}
}

	