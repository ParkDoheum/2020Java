package kr.hkit.first;

import java.util.*;

public class MyArrayListTest {

	public static void main(String[] args) {
		MyArrayList malist = new MyArrayList();
		
		malist.add(10); //0
		malist.add(20); //1
 		malist.add(30); //2
		
		malist.add(1, 50);
		
		//10, 50, 20, 30
		
		malist.showMyValues();
	}

}
