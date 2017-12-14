package Morning;

public class Wife {
	private String name;
	private Child child;
	private Father father;

	public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "Wife [ÐÕÃû£º" + name + "£¬ ¸¸Ç×£º" + father.getName() + ", º¢×Ó£º" + child.getName() + "]";
	}

}
