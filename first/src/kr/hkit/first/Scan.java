package kr.hkit.first;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력: ");
		String name = scan.next();
		
		System.out.print("당신의 나이 입력: ");
		int age = scan.nextInt();
		
		System.out.printf("당신의 이름은 %s, 나이는 %d 입니다.\n", name, age);
		
	}
}
