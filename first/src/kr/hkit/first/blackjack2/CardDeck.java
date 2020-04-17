package kr.hkit.first.blackjack2;

import java.util.*;

public class CardDeck {
	//private Card[] cards = new Card[52]; //0~51 (0~12 , 13~25, 26~38, 39~51)
	private List<Card> cards = new ArrayList();
	private String[] patterns = {"스페이드", "하트", "클로버", "다이아몬드"};
	
	public CardDeck() {
		init();
	}
	
	private void init() {
		int idx = 0;
		for(int i=0; i<patterns.length; i++) {
			for(int z=1; z<=13; z++) {
				String denomination = "";
				int score = z;
				if(z > 10) {
					score = 10;
				}
				
				switch(z) {
				case 1:
					denomination = "A";
					break;
				case 11:
					denomination = "J";
					break;
				case 12:
					denomination = "Q";
					break;
				case 13:
					denomination = "K";
					break;
				default:
					denomination = String.valueOf(z); //2~10
					break;
				}
				
				//cards[idx++] = new Card(patterns[i], denomination, score);
				
				Card card = new Card(patterns[i], denomination, score);
				cards.add(card);
			}
		}
	}
	
	public Card pick() {
		if(cards.size() == 0) {
			return null;
		}
		int rIdx = (int)(Math.random() * cards.size());
		Card c = cards.get(rIdx);
		cards.remove(c);
		return c;
	}
	
	
	public void shakeCards() {
		for(int i=0; i<cards.size(); i++) {
			int rIdx = (int)(Math.random() * cards.size()); //0~51
	
			Card c = cards.get(rIdx);
			cards.remove(c);
			cards.add(i, c);
		}
	}
	
	public void showMyCards() {
		int i=0;
		for(Card c : cards) {
			i++;
			System.out.println(c);
		}
		
		System.out.println("cnt : " + i);
	}
}
