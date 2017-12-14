package SecondHomework.Contact;

import java.util.Arrays;

public class Contact {
	/*
	 * ���� ���� ���Ա� �� �绰���롢 סַ �� �������� �� 
		���췽�� �� ���� ���绰����
		��ʾ��ϵ����Ϣ
	 */
	private String name ;
	private long number;
	private String address;
	private String sex;
	
	public Contact() {
		super();
	}

	public Contact(String name, long number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + ", address=" + address + "]" + "\t\n ";
	}
	//���ݵ绰����������ϵ��
	public Contact getContact(long number) {
		if (this.getNumber() == number) {
			return this ;
		}
		else {
			return null ;
		}
	}
}
