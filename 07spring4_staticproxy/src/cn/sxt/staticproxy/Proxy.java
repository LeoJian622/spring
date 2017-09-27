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

	// 中介租房
	public void rent() {
		showHouse();
		host.rent();
		fare();
	}

	// 看房
	private void showHouse() {
		System.out.println("showing the house!");
	}

	// 收取中介费
	private void fare() {
		System.out.println("get fare!");

	}
}
