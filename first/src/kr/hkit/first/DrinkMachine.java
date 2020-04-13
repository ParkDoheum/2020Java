package kr.hkit.first;

import java.util.Scanner;

public class DrinkMachine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] productArray = {"콜라", "사이다", "환타", "맥콜", "마운틴듀"};
		int[] priceArray = {700, 800, 900, 500, 600};
		
		System.out.println("번호 \t 제품명 \t 가격");
		for(int i=0; i<productArray.length; i++) {
			System.out.printf("%d \t %s \t %d \n", i+1, productArray[i], priceArray[i]);
		}
		
		System.out.print("구매할 제품의 번호를 입력해 주세요: ");
		int choice = scan.nextInt();
		
		//choice값을 토대로 어떤 제품인지 그 제품의 가격은 얼마인지 나타내시구요.
		//혹시나 없는 번호 1~5 사이 값이 아니면 "잘못 입력하셨습니다"
		
		
		if(choice < 1 || choice > productArray.length) {
			System.out.println("잘 못 입력하셨습니다.");
			return;
		}
		
		System.out.printf("%s의 가격은 %d입니다\n"
				, productArray[choice-1], priceArray[choice-1]);
		
		
		
	}
}
