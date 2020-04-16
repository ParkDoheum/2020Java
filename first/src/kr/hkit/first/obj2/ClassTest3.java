package kr.hkit.first.obj2;

public class ClassTest3 {

	public static void main(String[] args) {
		
		ClassC cc = new ClassC();
		callMethod(cc);
		
		ClassB cb = cc;
		/*
		callMethod(new ClassB());
		
		callMethod(new ClassA());
		*/
	}
	
	public static void callMethod(ClassA ca) {
		ca.methodA();
		
		if(ca instanceof ClassB) {
			ClassB cb = (ClassB)ca;
			cb.methodB();
		} 
		if(ca instanceof ClassC) {
			ClassC cc = (ClassC)ca;
			cc.methodC();
		}
		
		//ca에 들어온 객체가 ClassB였다면
		//추가로 methodB 메소드를 호출해 주세요.
		//ca에 들어온 객체가 ClassC였다면
		//추가로 methodB, methodC 메소드를 호출해 주세요
	}

}
