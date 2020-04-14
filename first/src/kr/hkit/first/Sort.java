package kr.hkit.first;

public class Sort {
	public static void main(String[] args) {
		int[] arr = {30, 19, 10, 45, 100, 90, 70};
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int z=i+1; z<arr.length; z++) {
				if(arr[i] > arr[z]) {
					int temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i != 0) { System.out.print(", ");}
			System.out.printf("%d", arr[i]);
		}
	}
}
