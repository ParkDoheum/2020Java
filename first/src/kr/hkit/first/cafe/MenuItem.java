package kr.hkit.first.cafe;

public class MenuItem {
	private String menuName;
	private int price;
	
	
	public MenuItem(String menuName, int price) {
		super();
		this.menuName = menuName;
		this.price = price;
	}

	public String getMenuName() {
		return menuName;
	}

	public int getPrice() {
		return price;
	}

}
