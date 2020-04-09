package kr.hkit.first;

public class Variable {
	public static void main(String[] args) {
		//bit > byte > kb > mb > gb > tb > hb
		
		//8bit > 1byte
		//1024byte > 1kb
		//1024kb > 1mb
		//정수형
		byte de5;
		de5 = 1;
		System.out.println(de5);
		de5 = 2;
		System.out.println(de5);
		de5 = 3;
		System.out.println(de5);
		
		int de3 = 1; //4byte
		long de4 = 11;
		
		
		de3 = (int)de4;
		
		//int : 0~8
		//long : 0~16
		
		
		//실수형(소수점) - 지수
		float f1 = 1.1F; //4byte
		double f2 = 1.1; //8byte
				
		//문자
		char ch = 'a';
		
		//bool형
		boolean bl1 = true;
		boolean bl2 = false;
		
		float f3 = 10.55f;
		int de6 = (int)f3;
		System.out.println(f3);
		System.out.println(de6);
		
		String str;
		
		str = "asdkldfjasldf";
		
		System.out.println(str);
		
	}
}







