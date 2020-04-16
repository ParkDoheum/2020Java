package kr.hkit.first.blackjack;

public class CardDeck {
	private Card[] cards = new Card[52]; //0~51 (0~12 , 13~25, 26~38, 39~51)
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
					denomination = String.valueOf(z);
					break;
				}
				
				cards[idx++] = new Card(patterns[i], denomination, score);
			}
		}
	}
	
	public Card pick() {
		while(true) {
			int rIdx = (int)(Math.random() * cards.length); //0~51
			//rIdx = 50;
			if(cards[rIdx] != null) { //만약 주소값이 있다면
				Card c = cards[rIdx];
				cards[rIdx] = null;
				return c;
			}
		}
	}
	
	public void shakeCards() {
		for(int i=0; i<cards.length; i++) {
			int rIdx = (int)(Math.random() * cards.length); //0~51
			
			Card c = cards[i];
			cards[i] = cards[rIdx];
			cards[rIdx] = c;
		}
	}
	
	public void showMyCards() {
		for(Card c : cards) {
			System.out.println(c);
		}
	}
}
