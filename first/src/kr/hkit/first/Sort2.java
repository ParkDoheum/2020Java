package kr.hkit.first;

import java.util.ArrayList;
import java.util.List;

public class Sort2 {
	public static void main(String[] args) {
		int[] arr = {30, 19, 10, 45, 100, 90, 70};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int z=0; z<arr.length-1-i; z++) {
				if(arr[z] > arr[z+1]) {
					int temp = arr[z];
					arr[z] = arr[z+1];
					arr[z+1] = temp;
				}
			}	
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i != 0) { System.out.print(", ");}
			System.out.printf("%d", arr[i]);
		}

	}

}





