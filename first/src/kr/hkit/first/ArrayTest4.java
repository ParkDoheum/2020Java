package kr.hkit.first;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		//String[] arr = new String[5];
		
		String[] arr = {"A", "B", "C", "D"}; //1GB
		
		Scanner[] arr2 = new Scanner[10];
		
		//System.out.println("ABC".equalsIgnoreCase("abc"));
		
		arr[0] = "asldfjaslkfj";
		arr[1] = "dskaaa";
		
		arr[1] = null;
		
		System.out.println(arr[1]);
		
		for(String val : arr) {
			System.out.println(val);
		}
		
	}

}
