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
	
	
}
