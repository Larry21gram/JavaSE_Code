package SecondHomework.Contact;

import java.util.Arrays;

public class Contact {
	/*
	 * 属性 姓名 、性别 、 电话号码、 住址 、 分组名称 、 
		构造方法 ： 姓名 、电话号码
		显示联系人信息
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
	//根据电话号码搜索联系人
	public Contact getContact(long number) {
		if (this.getNumber() == number) {
			return this ;
		}
		else {
			return null ;
		}
	}
}
