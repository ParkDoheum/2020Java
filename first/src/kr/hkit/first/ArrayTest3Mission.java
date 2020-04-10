package kr.hkit.first;

public class ArrayTest3Mission {

	public static void main(String[] args) {
		int[] math = {50, 20, 80, 82, 87, 70, 95, 10};
		int sum = 0;
		double avg = 0;
		int max = math[0];
		int min = math[0];
		for(int i=0; i<math.length; i++) {
			sum += math[i];
			
			if(max<math[i]) {
				max = math[i];
			}
			
			if(min>math[i]) {
				min = math[i];
			}
		}
		
		avg = (double)sum / math.length;
		
		System.out.printf("평균값: %.2f\n", avg);
		System.out.printf("전체 합계: %d\n", sum);
		System.out.printf("Max: %d\n", max);
		System.out.printf("Min: %d\n", min);
	}

}
