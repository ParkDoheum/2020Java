package kr.hkit.first.obj;

public class PolyTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.printMySpec();
		
		CarChild cc = new CarChild();
		cc.printMySpec();
		cc.speakHorn();
		
		Car car2 = cc;
		System.out.println("----------");
		car2.printMySpec();
		
		
		CarChild cc2 = (CarChild)car;
		
	}
	/*
	 * 
	 * <다형성>
		1. 부모 타입은 자식 객체의 주소값을 저장할 수 있다
		   (가리킬 수 있다)
		2. 자식 타입은 부모 객체의 주소값을 저장할 수 없다.
		   (가리킬 수 없다)
		3. 변수 타입은 메소드를 호출 가능, 불가능 결정!!!
		4. 호출이 된다면 해당 객체의 내용이 실행이 된다
	 * 
	 */

}
