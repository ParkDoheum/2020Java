package kr.hkit.first.obj;

public class CarTest {
	public static void main(String[] args) {
		//Car car = new Car();
		//car.printMySpec();
		
		Car car = new Car();
		
		CarChild carChild = new CarChild();
		
		car.printMySpec();
		carChild.printMySpec();
	}

}
