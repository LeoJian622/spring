package cn.sxt.vo;

public class User {
	public User() {
		System.out.println("user�޲ι��췽��");
	}

	// beanͨ���вι��췽����������
	public User(String name) {
		super();
		this.name = name;
	}

	private String name;

	// beanͨ���޲ι��췽����������Ҫʵ��set����
	 public void setName(String name) {
	 this.name = name;
	 }

	public void show() {
		System.out.println("name=" + name);
	}
}
