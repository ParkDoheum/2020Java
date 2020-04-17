package kr.hkit.first.abst;

import kr.hkit.first.inter.*;

public class Bat extends Animal implements Walkable, Flyable {
	public Bat() {
		super("포유류");
	}

	@Override
	public void fly() {
		System.out.println("멀리 멀리 날아간다.");
	}

	@Override
	public void walk() {
		System.out.println("뚜벅뚜벅");
	}

	@Override
	public void sound() {
		System.out.println("초음파!!!!!");
		
	}
}
