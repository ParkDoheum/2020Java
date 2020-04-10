package kr.hkit.first;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] arr1 = new int[3]; //A
		int[] arr2 = new int[3]; //B
		
		arr1[0] = 5;
		arr1[1] = 22;
		arr1[2] = 10;
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int val : arr2) {
			System.out.println(val);
		}
		System.out.println(arr1 == arr2);
		
	}

}
