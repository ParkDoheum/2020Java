package kr.hkit.first;

public class ArrayTest4 {

	public static void main(String[] args) {
		String[] arr = new String[5];
		
		System.out.println("ABC".equalsIgnoreCase("abc"));
		
		arr[0] = "asldfjaslkfj";
		arr[1] = "dskaaa";
		
		arr[1] = null;
		for(String val : arr) {
			System.out.println(val);
		}
		
		
		
	}

}
