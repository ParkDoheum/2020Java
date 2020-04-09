package kr.hkit.first;

import java.util.Scanner;

public class Mission_2 {

	public static void main(String[] args) {
		//0~5값을 입력
		//1~5값을 입력하면 그 값이 그대로 출력되면 되구요.
		//0을 입력되면 종료!!!
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1~5값 입력 (종료:0): ");
		int val = scan.nextInt();
		while(val != 0) {
			System.out.println("val : " + val);
			
			System.out.print("1~5값 입력 (종료:0): ");
			val = scan.nextInt();
		}
		System.out.println("종료!!");
	}

}
