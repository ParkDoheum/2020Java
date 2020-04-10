package kr.hkit.first;

public class Repeat2 {
	public static void main(String[] args) {
		//continue, break
		//Naming Loop
		//continue > Skip
		//break > Quit
		
		/*
		for(int i=0; i<10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		*/
		/*
		for(int i=0; i<10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		*/
		
		Parent:
		for(int i=0; i<10; i++) {
			for(int z=0; z<10; z++) {
				if(z==3) {
					break Parent;
				}
				System.out.printf("i:%d, z:%d\n", i, z);
			}
		}
		
		/*
		for(int i=0; i<10; i++) {
			for(int z=0; z<10; z++) {
				if(z==3) {
					continue;
				}
				System.out.printf("i:%d, z:%d\n", i, z);
			}
		}
		*/
		
	}
}
