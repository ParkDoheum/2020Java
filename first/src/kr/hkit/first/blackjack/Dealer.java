package kr.hkit.first.blackjack;

public class Dealer extends Gamer {
	final int CAN_RECEIVE_POINT = 16;
			
	public void moreCard(CardDeck cd) {
		int sum = getScoreSum();
		
		if(sum <= CAN_RECEIVE_POINT) {
			receiveCard(cd.pick());
		}
	}
 }
