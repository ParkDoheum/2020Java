package kr.hkit.first;

public class Condition {
	public static void main(String[] args) {
		//if문, switch문
		
		int n1 = 20, n2 = 14, n3 = 5;
		if(n1 > n2) {
			System.out.println(n1);
		}
		
		if(n1 > n2) {
			System.out.println("2번째 : " + n1);
		} else {
			System.out.println("2번째 : " + n2);
		}
		
		if(n1 > n2) {
			System.out.println("3번째@@ : " + n1);
		} 
		
		if(n1 > n3) {
			System.out.println("3번째!! : " + n1);
		} 
		if(n1 > n3) {
			System.out.println("3번째!! : " + n1);
		}
		
		if(n1 > n2) {
			System.out.println("3번째@@ : " + n1);
		} else if(n1 > n3) {
			System.out.println("3번째!! : " + n1);
		} else if(n1 > n3) {
			System.out.println("3번째!! : " + n1);
		} else {
			
		}
		
		//!!!!!!!! 문자열비교는 equals() 메소드를 이용한다  !!!!!!
		String sex = new String("남"); 
		
		if(sex.equals(new String("남"))) {
			System.out.println("남자 화장실로 가세요");
		} else if(sex.equals(new String("여"))) {
			System.out.println("남자 화장실로 가세요");
		} else {
			System.out.println("????");
		}
		
	}
}
