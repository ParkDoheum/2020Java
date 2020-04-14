package kr.hkit.first.obj;

public class CarChild extends Car {
	public CarChild() {
		super("마티즈", 1600);
	}

	public void me() {
		setNm("dd");
	}
	
	//오버라이딩 
	@Override
	public void printMySpec() {
		System.out.printf("My car name is %s and %dcc\n", nm, cc);
	}
}
