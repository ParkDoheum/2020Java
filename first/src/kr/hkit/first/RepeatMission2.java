package kr.hkit.first;

public class RepeatMission2 {

	public static void main(String[] args) {
		// 별찍기
		int line = 6;
		for(int i=0; i<line; i++) {
			for(int z=0; z<=i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
