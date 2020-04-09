package kr.hkit.first;

public class Variable2 {
	public static void main(String[] args) {
		
		int a = 10;
		
		a = -a;
		
		System.out.println("a : " + a);
		
		//변수명 만들때 주의점
		
		//1.대소문자 가린다
		int weight, Weight, wEight;
		
		//2.숫자가 맨 앞에 오면 안됩니다. 뒤쪽에는 사용해도 된다
		//int 12a;
		
		//3.특수기호 _, $
		int _age = 10, $age = 10, ggg, aaa = 10;
		
		//4.예약어를 사용 X
		//int int=10;
		
		//5.권고사항!!!
		int aAsdf; //소문자로 시작 (카멜케이스기법 쓰시면 가장 나이스)
		int myNameIsDoheum;
		final double PI = 3.14;
		
		String name = "박도흠";
		int age = 12;
		double height = 175.4;
		
		String result = "제 이름은 " + name + "입니다. 제 나이는 " 
					+ age + "세 입니다. 제 키는 " + height + "cm입니다.";
		
		System.out.println(result);
		
		System.out.printf("제 이름은 %s입니다. 제 나이는 %d세 입니다. 제 키는 %.1fcm입니다\n", name, age, height);
		
		String result2 = String.format("제 이름은 %s입니다. 제 나이는 %5d세 입니다. 제 키는 %.1fcm입니다\n", name, age, height);
		System.out.println(result2);
		char ch = 'B';
		
		System.out.printf("%c는 정수 %d이다.\n", ch, (int)ch);
		
		System.out.printf("%%c.... \\n");
	}
}
