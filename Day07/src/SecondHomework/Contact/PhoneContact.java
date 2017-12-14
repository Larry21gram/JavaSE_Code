package SecondHomework.Contact;

import java.util.Arrays;

public class PhoneContact{
	// �ֻ���ϵ����    ��װ��ϵ��
	
	private Group[] all = new Group[20];
	
	public Group[] getAll() {
		return all;
	}

	public void setAll(Group[] all) {
		this.all = all;
	}
	//��������
	public void addGroup(Group group) {
		for (int i = 0; i < this.all.length; i++) {
			if (this.all [i] == null) {
				this.all[i] = group ;
				break;
			}
			else if(this.all != null) {
				System.out.println("�ѵ��������ޣ��޷������������顣");
			}
		}
	}
	
	// ��ָ���������Contact
	public void addContact(Contact person , String name) {
		int i = 0;
		for (; i < this.all.length; i++) {
			if (this.all[i] != null) {
				
				if (this.all[i].getName().equals(name)) {
					this.all[i].addGroup(person);
				}
				else {
					System.out.println("Ϊ�ҵ����飡����");
				}
				
			}
			else {
				continue;
			}
			if (i == this.all.length) {
				System.out.println("δ�������飡����");
			}
		}
	}
	//չʾ������ϵ�� �� ���������ϵ��  =�� ������ӡ
	public void print(PhoneContact ph ) {
		// 
		if (ph != null) {
			System.out.println("������ϵ�ˣ�{");
			for (int i = 0; i < ph.all.length; i++) {
				//��������ϵ�˲������
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
	
	//��ȡ����Ů����ϵ��: ��á�������ϵ�ˡ���> ����  => ���Ա�ƥ������ϵ�ˣ���װ��һ�������� ���������鲢������ӡ
	public void printWoman() {
		if (this.all != null ) {
			System.out.println("����Ů����ϵ�ˣ�{");
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
	
	//���ݵ绰����������ϵ��: ���������ϵ�� =�� ����������ϵ�� =��������ƥ����ϵ�˲�������ϵ��
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
	//��ȡĳ�������µ�������ϵ�� �� ���ĳ������   =�� ������ӡ
	public void printGroup(String groupName) {
		if (this.all != null) {
			System.out.println(groupName + "����ϵ�����£�{");
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

	