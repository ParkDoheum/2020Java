package kr.hkit.first.obj2;

public class ClassTest {

	public static void main(String[] args) {
		ClassC cc = new ClassC();
		cc.methodA();
		cc.methodB();
		cc.methodC();
		
		ClassB cb = new ClassB();
		cb.methodA();
		cb.methodB();
		//cb.methodC();
		
		ClassA ca = new ClassA();
		ca.methodA();
		//ca.methodB();
		//ca.methodC();

	}

}
