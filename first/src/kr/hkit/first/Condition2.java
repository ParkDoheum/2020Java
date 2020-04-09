package kr.hkit.first;

public class Condition2 {
	public static void main(String[] args) {
		//switch
		
		String nm = "A";
		
		switch(nm) {
		case "A":
			System.out.println("A입니다.");
			
		case "B":
			System.out.println("This is B");
			break;
		case "C":
			System.out.println("CCCCCCCC");
			
		case "D":
			System.out.println("배불러");
			
		default:
			System.out.println("????");
			break;
		}
		
		int num = 10;
		
		//10~8 > A
		//7~6 > B
		//5~3 > C
		//2~0 > D
		
		switch(num) {
		case 10:case 9:case 8:
			System.out.println("A");
			break;
		}
		
		if(num <= 10 && num >= 8) {
			
		}
		
		//삼항식
		int n1 = 20, n2 = 22;
		System.out.println("n1과 n2중에 누가 더 크니? " + (n1 > n2 ? "n1" : "n2"));
		
	}
}
