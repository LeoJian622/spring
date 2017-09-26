package cn.sxt.vo;

public class User {
	public User() {
		System.out.println("user无参构造方法");
	}

	// bean通过有参构造方法创建对象
	public User(String name) {
		super();
		this.name = name;
	}

	private String name;

	// bean通过无参构造方法创建对象，要实现set方法
	 public void setName(String name) {
	 this.name = name;
	 }

	public void show() {
		System.out.println("name=" + name);
	}
}
