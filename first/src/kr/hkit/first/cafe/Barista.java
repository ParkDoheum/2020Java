package kr.hkit.first.cafe;

public class Barista {
	public Coffee makeCoffee(MenuItem mi) {
		return new Coffee(mi);
	}
}
