package kr.hkit.first.blackjack;

import java.util.Scanner;

public class Game {
	final static int INIT_RECEIVE_CARD_COUNT = 2;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
		Rule rule = new Rule();
		
		for(int i=0; i<INIT_RECEIVE_CARD_COUNT; i++) {
			gamer.receiveCard(cd.pick());
			dealer.receiveCard(cd.pick());
		}
		dealer.moreCard(cd);
		
		while(true) {
			gamer.showMyCards();
			
			System.out.print("카드를 더 뽑겠습니까? (종료: 0) : ");
			String answer = scan.next();
			
			if(answer.equals("0")) {
				break;
			}
			
			gamer.receiveCard(cd.pick());
		}
		dealer.showMyCards();
		
		rule.whoIsWin(gamer, dealer);
		
		//52장의 카드 정보가 나오면 콘솔창에
	}

}
