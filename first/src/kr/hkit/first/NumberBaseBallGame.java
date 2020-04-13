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
		System.out.println();
		
		int s = 0, b = 0, cnt = 0;
		while(s < num) {
			cnt++;
			s = 0;
			b = 0;
			for(int i=0; i<userNum.length; i++) {
				System.out.printf("%d번째 값 입력: ", i+1);
				userNum[i] = scan.nextInt();
			}
			
			for(int i=0; i<gameNum.length; i++) {
				
				for(int z=0; z<userNum.length; z++) {
					
					if(gameNum[i] == userNum[z]) {
						if(i == z) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			
			System.out.printf("S:%d | B:%d | O:%d\n"
					, s, b, num - (s + b));
			
		}
		
		System.out.println("게임 종료!!" + cnt + "번 시도");
		scan.close();
		
	}

}
