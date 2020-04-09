package kr.hkit.first;

import java.util.Scanner;

public class Mission_1 {

	public static void main(String[] args) {
		//1~12까지의 값을 스캐너를 통해서 입력 받는다. (월)
		
		//12, 1, 2 > 겨울
		//3, 4, 5 > 봄
		//6, 7, 8 > 여름
		//9, 10, 11 > 가을 
		//1~12 값이 아니면 > 잘 못 입력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요 (1~12): ");
		int season = scan.nextInt();
		
		if(season < 1 || season > 12) {
			System.out.println("잘 못 입력");
		} else if(season == 12 || season == 1 || season == 2) {
			System.out.println("겨울");
		} else if (season <= 5) {
			System.out.println("봄");
		} else if (season < 9) {
			System.out.println("여름");
		} else {
			System.out.println("가을");
		}
		
		/*
		switch(season) {
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("잘 못 입력");
		}
		*/
		

	}

}





