package kr.hkit.first;

public class RepeatMission3 {
	public static void main(String[] args) {
		//REVERSE 별찍기
		int line = 8;
		
		for(int i=1; i<=line; i++) {
			for(int z=0; z<line; z++) {
				if(z < line-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
