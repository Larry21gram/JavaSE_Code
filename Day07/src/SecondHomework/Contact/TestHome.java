package SecondHomework.Contact;

public class TestHome {
	public static void main(String[] args) {
		Contact person = new Contact();
		person.setName("wang");
		person.setSex("woman");
		person.setNumber(18181818);
		Group group = new Group();
		group.setName("分组一");
		PhoneContact ph = new PhoneContact();
		ph.addGroup(group);
		ph.addContact(person, "分组一");
		ph.print(ph);
		ph.printGroup("分组一");
		ph.printWoman();
		System.out.println(ph.lookForPerson(18181818));
	}
}
