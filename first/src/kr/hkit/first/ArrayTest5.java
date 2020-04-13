package kr.hkit.first;

public class ArrayTest5 {

	public static void main(String[] args) {
		//수학(sum, avg)
		//영어(sum, avg)
		//국어(sum, avg)
		
		//0번 학생 (sum, avg)
		//1번 학생 (sum, avg)
		//2번 학생 (sum, avg)
		//3번 학생 (sum, avg)
		 
		int mathSum = 0, engSum = 0, korSum = 0;
		int stu0Sum = 0, stu1Sum = 0, stu3Sum = 0, stu4Sum = 0;
		
		int[][] arr = {
			{70, 12, 66, 90}, //수학점수들
			{10, 20, 30, 40}, //영어점수들
			{45, 23, 12, 9}, //국어점수들
		};
		
		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<arr[i].length; z++) {
				if(i==0) { //math
					mathSum += arr[i][z];
				} else if(i == 1) { //eng
					engSum += arr[i][z];
				} else { //kor
					korSum += arr[i][z];
				}
				
				if(z == 0) {
					stu0Sum += arr[i][z];
				} else if(z == 1) {
					stu1Sum += arr[i][z];
				}
			}
		}
		
		System.out.printf("수학 sum: %d, avg: %.1f\n"
				, mathSum, (double)mathSum / arr[0].length);
		
		System.out.printf("학생0 sum: %d, avg: %.1f\n"
				, stu0Sum, (double)stu0Sum / arr.length);
		
		/*
		for(int[] arrOne : arr) {
			for(int val : arrOne) {
				System.out.println(val);
			}
		}
		*/

	}

}
