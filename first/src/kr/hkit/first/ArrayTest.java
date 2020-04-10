package kr.hkit.first;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		arr[0] = 11;
		arr[8] = 23;
		
		for(int i=0; i<10; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
		
		
		int[] arr2 = {10, 20, 30, 35, 40};
		String[] arr3 = {"ddd", "aa", "asdfaf"};
		
		for(int val : arr2) {
			System.out.println("foreach : " + val);
		}
		for(String val : arr3) {
			System.out.println("foreach : " + val);
			
		}
		/*
		int[] arr2 = new int[5];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		arr2[3] = 35;
		arr2[4] = 40;
		*/
		/*
		for(int i=0; i<arr2.length; i++) {
			System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
		}
		*/
		//foreach
		for(int val : arr2) {
			System.out.printf("%d\n", val);
		}
	}
}
