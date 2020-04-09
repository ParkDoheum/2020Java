package kr.hkit.first;

public class Operation2 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 3;
		int result = num1 / num2;
		int result2 = num1 % num2;
		
		System.out.printf("%d = %d mod %d\n",  result2, num1 , num2);
		
		//비교연산자의 결과는 boolean
		//이상(그 값 포함), 초과(그 값 미포함)
		//이하, 미만
		
		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("10 > 10 : " + (10 > 10));
		System.out.println("10 == 10 : " + (10 == 10));
		System.out.println("10 != 9 : " + (10 != 9));
		System.out.println("10 >= 10 : " + (10 >= 10));
		
		//논리연산자 and(&&), or(||), not(!)
		//&&가 true가 될 수 있는 조건, 모두 true 나머지 false
		//false가 1개라도 있어도 false
		
		//||은 true가 될 수 있는 조건, 1개 true만 있어도 true
		//false가 되려면 모두 false
		
		System.out.println("1 == 1 && 2 == 2 : " + (1 == 1 && 2 == 2));
		System.out.println("1 == 1 && 2 == 3 : " + (1 == 1 && 2 == 3));
		System.out.println("1 == 1 || 2 == 3 : " + (1 == 1 || 2 == 3));
		System.out.println("1 == 2 || 2 == 3 : " + (1 == 2 || 2 == 3));
		
	}
}
