package kr.hkit.first;

public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "이순신";
		
		Human h2 = new Human();
		h2.name = "홍길동";
		
		h1 = h2;
		
		h1.study();
		h2.study();
		
		h1.run();
		h2.run();
				
				
		
						

	}

}
