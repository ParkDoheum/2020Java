package kr.hkit.first.obj2;

public class ClassB extends ClassA {
	public void methodB() {
		System.out.println("methodB in ClassB---");
	}
	
	@Override
	public void methodA() {
		System.out.println("클래스B에 있는 methodA입니다.");
	}
}
