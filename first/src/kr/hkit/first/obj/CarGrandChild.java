package kr.hkit.first.obj;

public class CarGrandChild extends CarChild {
	//오버라이딩 
	@Override
	public void printMySpec() {
		System.out.printf("CarGrandChild %s and %dcc\n", nm, cc);
	}
}
