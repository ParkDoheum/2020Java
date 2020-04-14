package kr.hkit.first.obj;

public class PolyTest2 {

	public static void main(String[] args) {
		CarGrandChild cgc = new CarGrandChild();
		CarChild cc = new CarChild();
		Car c = new Car();
		
		callPrintMySpec(cgc);
		callPrintMySpec(cc);
		callPrintMySpec(c);
	}
	
	public static void callPrintMySpec(Car obj) {
		obj.printMySpec();
	}
}
