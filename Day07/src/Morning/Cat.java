package Morning;

public class Cat {
	private String name ;
	private Person owner;
	// ���췽�� : ������������ͬ ��û�з���ֵ��
	public Cat(Person owner) {
		super();
		// ��������ʱ������ĵ�ֵַ��this.owner ��
		this.owner = owner;
	}
	//������вι��죬�򲻻��Զ��ṩ�޲ι��졣
	public Cat() {
		super();
	}
	// get ����һ��Ҫ�У��������������ȡ��Դ��
	public Person getOwner() {
		return owner;
	}
	// �����޸����ԣ��Ͼ�����ÿ�����ԣ�ÿ������һ����
	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", owner=" + owner.toString() + "]";
	}

}
