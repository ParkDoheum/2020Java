package kr.hkit.first.obj2;

public class ClassTest2 {

	public static void main(String[] args) {
		//ClassC cc = (ClassC)new ClassA();
		ClassA ca = new ClassC();
		ClassC cc = (ClassC)ca;
		
		System.out.println(ca == cc);
		
		ca.methodA();
		//ca.methodB();
		//ca.methodC();
		
		cc.methodA();
		cc.methodB();
		cc.methodC();
		
		//ClassC cc = new ClassC();
		
		
	}

}
