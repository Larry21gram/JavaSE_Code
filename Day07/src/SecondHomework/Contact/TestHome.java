package SecondHomework.Contact;

public class TestHome {
	public static void main(String[] args) {
		Contact person = new Contact();
		person.setName("wang");
		person.setSex("woman");
		person.setNumber(18181818);
		Group group = new Group();
		group.setName("����һ");
		PhoneContact ph = new PhoneContact();
		ph.addGroup(group);
		ph.addContact(person, "����һ");
		ph.print(ph);
		ph.printGroup("����һ");
		ph.printWoman();
		System.out.println(ph.lookForPerson(18181818));
	}
}
