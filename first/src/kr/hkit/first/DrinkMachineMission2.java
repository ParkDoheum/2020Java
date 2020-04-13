package kr.hkit.first;

import java.util.Scanner;

public class DrinkMachineMission2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] productArray = {"콜라", "사이다", "환타", "맥콜", "마운틴듀", "2%"};
		int[] priceArray = {700, 800, 900, 500, 600, 400};
		
		int[] purchaseArray = new int[productArray.length]; //6 (0~5)
		
		System.out.println("번호 \t 제품명 \t 가격");
		for(int i=0; i<productArray.length; i++) {
			System.out.printf("%d \t %s \t %d \n", i+1, productArray[i], priceArray[i]);
		}
		
		while(true) {
			System.out.print("구매할 제품의 번호를 입력해 주세요 (종료:0) : ");
			int choice = scan.nextInt();
			
			if(choice == 0) {
				System.out.println("종료!!");
				break;
			} else if(choice < 1 || choice > productArray.length) {
				System.out.println("잘 못 입력하셨습니다");
				continue;
			}
			
			choice--;
			System.out.printf("%s의 가격은 %d입니다\n\n"
					, productArray[choice], priceArray[choice]);
			
			purchaseArray[choice]++;
		}
		
		for(int i=0; i<purchaseArray.length; i++) {
			if(purchaseArray[i] > 0) {
				String nm = productArray[i];
				int price = priceArray[i];
				int qty = purchaseArray[i];
				System.out.printf("%s \t %d개 %,d원\n"
						, nm, qty, price * qty);
			}
		}
	}
}
