package kr.hkit.first;

public class RepeatMission {

	public static void main(String[] args) {
		//구구단
		//3단 (중첩 for문 X)
		/*
		int dan = 4;
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, (dan*i));
		}
		*/
		//2~9단까지
		/*
		for(int z=2; z<=9; z++) {
			for(int i=1; i<10; i++) {
				System.out.printf("%d X %d = %d\n", z, i, (z*i));
			}
			if(z < 9) {
				System.out.println("---------------");
			}
		}
		*/
		//2~9 
		for(int i=1; i<10; i++) {
			for(int z=2; z<10; z++) {
				System.out.printf("%d X %d = %d\t", z, i, (z*i));
			}
			System.out.println();
		}
	}

}





