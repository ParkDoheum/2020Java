package kr.hkit.first.blackjack2;

import java.util.*;

public class Gamer {
	//protected Card[] myCards = new Card[20];
	protected List<Card> myCards = new ArrayList();
	
	
	//외부로부터 Card주소값이 넘어오면 myCards 배열에 순서대로 주소값을 저장하는
	//메소드를 만드시오.
	public void receiveCard(Card c) {
		myCards.add(c);
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
		System.out.printf("합계: %d\n",  getScoreSum());
	}
}
