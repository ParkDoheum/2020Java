package kr.hkit.first;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		//System.out.println("arr1 == arr2 : " + (arr1 == arr2));
		//0, 2, 4, 6, 8
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = i * 2;
		}
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("arr1 == arr2 : " + (arr1 == arr2));
		for(int val : arr1) {
			System.out.println(val);
		}
		System.out.println("-------------");
		for(int val : arr2) {
			System.out.println(val);
		}
		//일반변수 vs 참조변수(주소값 저장)
	}
}
