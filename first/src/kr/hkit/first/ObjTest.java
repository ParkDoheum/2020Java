package kr.hkit.first;

public class ObjTest {

	public static void main(String[] args) {
		//일반 변수 vs 레퍼런스 변수 
		int val = 10;
		System.out.println("val : " + val);
		change(val);
		System.out.println("val : " + val);
		
		Numb numb = new Numb();
		numb.val = 10;
		System.out.println("numb.val : " + numb.val);
		change(numb);
		System.out.println("numb.val : " + numb.val);
	}
	
	public static void change(int val) {
		val = 20;
	}
	
	public static void change(Numb nb) {
		nb.val = 20;
	}

}

class Numb {
	int val;
}