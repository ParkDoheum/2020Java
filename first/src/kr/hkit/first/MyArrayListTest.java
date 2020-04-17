package kr.hkit.first;

import java.util.*;

public class MyArrayListTest {

	public static void main(String[] args) {
		MyArrayList malist = new MyArrayList();
		
		malist.add(10); //0
		malist.add(20); //1
 		malist.add(30); //2
		
		malist.add(1, 50);
		
		malist.remove(2);
		
		//10, 50, 20, 30
		
		//10, 50, 30
		
		malist.showMyValues();
		
		Object obj = malist.get(1);
		System.out.println(obj);
	}

}
