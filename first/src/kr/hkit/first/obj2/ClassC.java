package kr.hkit.first.obj2;

public class ClassC extends ClassB {
	public void methodC() {
		System.out.println("---methodC in ClassC---");
	}
	
	@Override
	public void methodA() {
		System.out.println("!!!!!!!");
	}
}
