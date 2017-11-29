package Morning;

public class Cat {
	private String name ;
	private Person owner;
	// 构造方法 : 名称与类名相同 ，没有返回值。
	public Cat(Person owner) {
		super();
		// 方法调用时将传入的地址值给this.owner 。
		this.owner = owner;
	}
	//如果有有参构造，则不会自动提供无参构造。
	public Cat() {
		super();
	}
	// get 方法一定要有，否则不能再类外获取资源。
	public Person getOwner() {
		return owner;
	}
	// 用于修改属性，毕竟不是每个属性，每个对象都一样。
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
