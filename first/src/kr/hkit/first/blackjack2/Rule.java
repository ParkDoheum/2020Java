package kr.hkit.first.blackjack2;

public class Rule {
	public void whoIsWin(Gamer gamer, Dealer dealer) {
		int gamerSum = gamer.getScoreSum();
		int dealerSum = dealer.getScoreSum();
		
		if((gamerSum > 21 && dealerSum > 21) || gamerSum == dealerSum) {
			System.out.println("비겼습니다.");
		} else if(gamerSum > 21) {
			System.out.println("딜러가 이겼습니다.");
		} else if (dealerSum > 21) {
			System.out.println("게이머가 이겼습니다.");
		} else if(dealerSum > gamerSum) {
			System.out.println("딜러가 이겼습니다.");
		} else {
			System.out.println("게이머가 이겼습니다.");
		}
		
		//누가 이겼는지?
		System.out.printf("게이머: %d, 딜러: %d\n", gamerSum, dealerSum);
		
	}
}
