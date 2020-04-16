package kr.hkit.first.blackjack;

public class Gamer {
	protected Card[] myCards = new Card[20];
	
	//외부로부터 Card주소값이 넘어오면 myCards 배열에 순서대로 주소값을 저장하는
	//메소드를 만드시오.
	private int idx = 0;
	
	public void receiveCard(Card c) {
		if(idx == myCards.length) {
			return;
		}
		myCards[idx++] = c;
	}
	
	public void receiveCard2(Card c) {
		for(int i=0; i<myCards.length; i++) {
			if(myCards[i] == null) {
				myCards[i] = c;
				break;
			}
		}
	}
	
	public int getScoreSum() {
		int sum = 0;
		for(Card c : myCards) {
			if(c == null) { break; }
			sum += c.getScore();
		}
		return sum;
	}
	
	public void showMyCards() {
		for(Card c : myCards) {
			if(c == null) {
				break;
			}
			System.out.println(c);
		}
	}
}
