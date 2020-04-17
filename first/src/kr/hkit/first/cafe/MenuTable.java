package kr.hkit.first.cafe;

import java.util.*;

public class MenuTable {
	private List<MenuItem> menus = new ArrayList();
	
	public MenuTable() {
		init();
	}
	
	private void init() {
		menus.add(new MenuItem("아메리카노", 1500));
		menus.add(new MenuItem("카푸치노", 2000));
		menus.add(new MenuItem("카라멜 마키아또", 2500));
		menus.add(new MenuItem("에스프레소", 2500));
	}
	
	public int getMenuSize() {
		return menus.size();
	}
	
	public MenuItem getItem(int idx) {
		return menus.get(idx);
	}
	
	public void showMenus() {
		System.out.println("\tMenus\n");
	
		for(int i=0; i<menus.size(); i++) {
			MenuItem mi = menus.get(i);
			System.out.printf("%d.\t %s \t %,d원\n", i+1, mi.getMenuName(), mi.getPrice());
			
		}
	}
	
	
}
