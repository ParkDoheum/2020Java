package kr.hkit.first.obj;

public class PolyTest2 {

	public static void main(String[] args) {
		CarGrandChild cgc = new CarGrandChild();
		CarChild cc = new CarChild();
		Car c = new Car();
		
		callPrintMySpec(cgc);
		callPrintMySpec(cc);
		callPrintMySpec(c);
		
		//callPrintMySpec("sss");
	}
	
	public static void callPrintMySpec(Car obj) {
		obj.printMySpec();
	}
	
	/*
	public static void callPrintMySpec(Object obj) {
		if(obj instanceof Car) {
			Car car = (Car)obj;
			car.printMySpec();
			return;
		}
		
		System.out.println(obj);
	}*/
}








