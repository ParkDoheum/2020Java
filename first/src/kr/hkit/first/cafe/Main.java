package kr.hkit.first.cafe;

public class Main {

	public static void main(String[] args) {
		MenuTable mt = new MenuTable();
		Customer cust = new Customer();
		Barista bar = new Barista();
		
		MenuItem mi = cust.chooseMenu(mt);
		
		Coffee coff = bar.makeCoffee(mi);
		
		cust.drinkCoffee(coff); //고객이 "커피명"을(를) 마신다
		
		//System.out.println("커피명 : " + coff.getName());

	}

}
