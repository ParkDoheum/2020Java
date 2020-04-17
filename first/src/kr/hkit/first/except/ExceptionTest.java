package kr.hkit.first.except;

import java.lang.ArithmeticException;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("1234");
		try {
			int a = 2;
			System.out.println(4 / a);
			return;
		} catch(ArithmeticException e) { 
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		System.out.println("5678");
	}

}
