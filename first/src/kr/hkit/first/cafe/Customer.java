package kr.hkit.first.cafe;

import java.util.Scanner;

public class Customer {
	private Scanner scan = new Scanner(System.in);
	
	public MenuItem chooseMenu(MenuTable mt) {
		mt.showMenus();
		
		while(true) {
			System.out.print("메뉴를 선택해 주세요: ");
			String answer = scan.next();
			
			int answerInt = parseStringToInt(answer);
			
			if(answerInt > 0 && answerInt <= mt.getMenuSize()) {
				return mt.getItem(answerInt - 1);
			}
			System.out.println("잘 못 선택하였습니다. 다시 선택해 주세요.");
		}
	}
	
	public void drinkCoffee(Coffee coff) {
		System.out.printf("고객이 %s을(를) 마신다\n", coff.getName());
	}
	
	private int parseStringToInt(String v) {
		int result = 0;
		try {
			result = Integer.parseInt(v); //"1212"
		} catch(Exception e) {}
		return result;
	}
}







