package kr.hkit.first;

public class Repeat {
	public static void main(String[] args) {
		//for, while, do-while, foreach
		
		//for: 몇 번 도는줄 알 때
		
		//while: 어떤 조건식일떄 동안 반복하고 싶다
		//   (A)     (B)   (C)
		for(int i=3; i<103; i++) {
			System.out.println("하하하" + i); //(D)
		}
		
		//A > (B > D > C) > (B > D > C) > (B > D > C)
		int i=0;
		while(i<10) {
			i++;
			System.out.println("하하하" + i); //(D)
		}
	
		
	}
}
