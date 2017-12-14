package Morning;

public class Child {
	private String name;
	private Father father;
	private Mother mother;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	public Mother getMother() {
		return mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}

	@Override
	public String toString() {
		return "Child [ÐÕÃû£º" + name + ", ¸¸Ç× £º" + father.getName() + ", Ä¸Ç×£º" + mother.getName() + "]";
	}

}
