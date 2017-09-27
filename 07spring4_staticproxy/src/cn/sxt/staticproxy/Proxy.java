package cn.sxt.staticproxy;

public class Proxy implements Rent {

	public Proxy() {
	}

	public Proxy(Host host) {
		super();
		this.host = host;
	}

	private Host host;

	public void setHost(Host host) {
		this.host = host;
	}

	// �н��ⷿ
	public void rent() {
		showHouse();
		host.rent();
		fare();
	}

	// ����
	private void showHouse() {
		System.out.println("showing the house!");
	}

	// ��ȡ�н��
	private void fare() {
		System.out.println("get fare!");

	}
}
