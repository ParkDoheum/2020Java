package kr.hkit.first;

public class HumanTest {

	public static void main(String[] args) {
		Human.nation = "Korea";
		//Human.study();

		
		Human h1 = new Human();
		h1.age = 20;
		
		h1.study();
		h1.run();
	}
	
	//접근지시어
	//private
	//default
	//protected
	//public

}
