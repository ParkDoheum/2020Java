package kr.hkit.first.abst;

public class Fish extends Animal {

	public Fish() {
		super("어류");
	}

	@Override
	public void sound() {
		System.out.println("...");
	}

}
