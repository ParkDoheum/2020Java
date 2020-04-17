package kr.hkit.first.abst;

import kr.hkit.first.inter.Walkable;

public class Dog extends Animal implements Walkable {
	public Dog() {
		super("포유류");
	}

	@Override
	public void sound() {
		System.out.println("멍멍!!");
	}

	@Override
	public void walk() {
		System.out.println("아장아장 걷습니다");
	}
}
