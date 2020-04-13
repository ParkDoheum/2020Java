package kr.hkit.first;

public class Method1 {
	//           리턴타입 메소드명 파라미터(매개변수)
	public static void main(String[] args) {
		//sum(11, 12);
		sum(11, 12);
		int result = sum(11, 12, 13);
		System.out.println(result);
		//multi(10, 20); //200 
		
		//minus(5, 10); //5
		//minus(20, 5); //15
	}
	
	public static void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	public static int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	public static void minus(int n1, int n2) {
		if(n1 > n2) {
			System.out.println(n1 - n2);
		} else {
			System.out.println(n2 - n1);
		}
	}
	
	public static void multi(int n1, int n2) {
		System.out.println(n1 * n2);
	}
	
	

}
