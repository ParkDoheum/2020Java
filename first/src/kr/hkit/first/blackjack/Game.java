package kr.hkit.first.blackjack;

public class Game {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		//cd.showMyCards();
		
		Card c = cd.pick();
		Card c2 = cd.pick();
		Card c3 = cd.pick();
		
		cd.showMyCards();
		//52장의 카드 정보가 나오면 콘솔창에
	}

}
