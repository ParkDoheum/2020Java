package kr.hkit.first;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		arr[0] = 11;
		arr[8] = 23;
		
		for(int i=0; i<10; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
		
	}
}
