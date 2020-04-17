package kr.hkit.first.abst;

public abstract class Animal {
	private String kind;
	
	public Animal(String kind) {
		this.kind = kind;
	}
	
	public void breath() {
		System.out.println("숨 쉰다");
	}
	
	public static void jump() {
		System.out.println("jumping!!!");
	}
	
	public abstract void sound();
}
