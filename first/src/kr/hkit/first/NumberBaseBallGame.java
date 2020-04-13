package kr.hkit.first;

import java.util.Scanner;

public class NumberBaseBallGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 몇개 게임을 하시겠습니까? (2~5)");
		int num = scan.nextInt();
		
		int[] gameNum = new int[num];
		int[] userNum = new int[num];
		
		for(int i=0; i<num; i++) {
			int val = (int)(Math.random() * 9 + 1); //2
			
			//중복체크
			for(int z=0; z<gameNum.length; z++) {
				if(gameNum[z] == 0) {
					gameNum[z] = val;
					break;
				} else if(gameNum[z] == val) {
					i--;
					break;
				}
			}
		}
		for(int val : gameNum) {
			System.out.print(val + ", ");
		}
		
		
		int s=0, b=0;
		while(s < num) {
			for(int i=0; i<userNum.length; i++) {
				System.out.printf("%d번째 값 입력: ", i+1);
				userNum[i] = scan.nextInt();
			}
			
			//s 몇개, b 몇개, o 몇개
			
			
		}
		
		System.out.println("게임 종료!!");
		
		
		
		
		scan.close();
		
	}

}
