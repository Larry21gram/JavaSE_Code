package Homework.Pet;

public class Pet {
	//pet : ���� ���ǳ� ������ֵ �����ܶȡ� Ʒ�ֻ����
	private String name;
	private int health;
	private int love;
	private String gander;
	private String Race ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getGander() {
		return gander;
	}
	public void setGander(String gander) {
		this.gander = gander;
	}
	public String getRace() {
		return Race;
	}
	public void setRace(String race) {
		Race = race;
	}
	@Override
	public String toString() {
		if (this.gander == null) {
			return "Pet [�ǳƣ�" + name + ", ����ֵ��" + health + ", ���ܶȣ�" + love + ", Ʒ�֣�" + Race
					+ "]";
		}
		else {
			return "Pet [�ǳ� =" + name + ", ����ֵ��" + health + ", ���ܶȣ�" + love + ", ������" + gander + "]";
		}
	}
	public Pet() {
		super();
		this.health = (int) (Math.random()*100);
		this.love = 0 ;
	}
	
	
}
