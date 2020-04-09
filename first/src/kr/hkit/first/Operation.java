package kr.hkit.first;

public class Operation {
	public static void main(String[] args) {
		int num = 10;
		System.out.printf("num : %d\n", num);
		
		num++;
		System.out.printf("num : %d\n", num);
		
		num--;
		System.out.printf("num : %d\n", num);
		
		num = num + 2;
		System.out.printf("num : %d\n", num);
		
		num = num - 3;
		System.out.printf("num : %d\n", num);
		
		num += 2;
		System.out.printf("num : %d\n", num);
		
		num -= 2;
		System.out.printf("num : %d\n", num);
		
		int num1 = 10, num2 = 3;
		
		int result = num1 / num2;
		System.out.printf("%d = %d / %d\n", result, num1, num2);
		
		double result2 = (double)num1 / num2;
		System.out.printf("%.1f = %d / %d\n", result2, num1, num2);
		
		//byte > short > int > long > float > double > String
	}
}
