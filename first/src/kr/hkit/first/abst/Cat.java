package kr.hkit.first.abst;

import kr.hkit.first.inter.Walkable;

public class Cat extends Animal implements Walkable {

	public Cat() {
		super("포유류");
	}
	
	public void scrach() {
		System.out.println("긁다!!");
	}

	@Override
	public void sound() {
		System.out.println("야옹~~");
		
	}

	@Override
	public void walk() {
		System.out.println("슬금슬금 걷는다");
	}

}
