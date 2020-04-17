package kr.hkit.first.cafe;

public class Coffee {
	private String name;

	public Coffee(MenuItem mi) {
		super();
		this.name = mi.getMenuName();
	}

	public String getName() {
		return name;
	}
}
