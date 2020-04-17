package kr.hkit.first.abst;

import java.util.*;

import kr.hkit.first.inter.Flyable;
import kr.hkit.first.inter.Walkable;

public class AbstractTest {

	public static void main(String[] args) {
		
		List<Animal> list = new ArrayList();
		list.add(new Dog());
		list.add(new Cat());
		list.add(new Fish());
		list.add(new Bat());
		
		for(Animal ani : list) {
			sound(ani);
		}
		System.out.println("----------------");
		for(Animal ani : list) {
			canWalk(ani);
		}
		System.out.println("----------------");
		for(Animal ani : list) {
			if(ani instanceof Flyable) {
				canFly((Flyable)ani);
			}
		}
	}
	
	public static void sound(Animal ani) {
		ani.sound();
	}

	public static void canWalk(Animal ani) {
		if(ani instanceof Walkable) {
			Walkable walkAnimal = (Walkable)ani;
			walkAnimal.walk();
		} else {
			System.out.println("걸을 수 없습니다.");
		}
	}
	
	public static void canFly(Flyable ani) {
		ani.fly();
	}
}
