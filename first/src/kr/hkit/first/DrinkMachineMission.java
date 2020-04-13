package kr.hkit.first;

import java.util.Scanner;

public class DrinkMachineMission {

	public static void main(String[] args) {
		//구매할 제품의 번호를 입력해 주세요 (종료:0) : 
		Scanner scan = new Scanner(System.in);
		
		String[] productArray = {"콜라", "사이다", "환타", "맥콜", "마운틴듀"};
		int[] priceArray = {700, 800, 900, 500, 600};
		
		while(true) {
			System.out.println("번호 \t 제품명 \t 가격");
			for(int i=0; i<productArray.length; i++) {
				System.out.printf("%d \t %s \t %d \n", i+1, productArray[i], priceArray[i]);
			}
			
			System.out.print("구매할 제품의 번호를 입력해 주세요 (종료:0) : ");
			int choice = scan.nextInt();
			
			if(choice == 0) {
				break;
			} else if(choice < 1 || choice > productArray.length) {
				System.out.println("잘 못 입력하셨습니다");
				continue;
			}
			
			choice--;
			System.out.printf("%s의 가격은 %d입니다\n\n"
					, productArray[choice], priceArray[choice]);
		}
		
		System.out.println("종료!!");
	}

}
