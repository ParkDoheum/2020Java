package kr.hkit.first.blackjack;

public class Card {
	private final String pattern; //무늬
	private final String denomination; //액면가 (A, 2~10, J, Q, K)
	private final int score; //점수
	
	//생성자
	//1.리턴타입이 없다
	//2.이름이 클래스명이랑 같다.
	public Card(String pattern, String denomination, int score) {
		this.pattern = pattern;
		this.denomination = denomination;
		this.score = score;
	}

	//getters
	public String getPattern() {
		return pattern;
	}

	public String getDenomination() {
		return denomination;
	}

	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s - %d"
				, pattern
				, denomination
				, score);
	}
}





