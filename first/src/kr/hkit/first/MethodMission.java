package kr.hkit.first;

public class MethodMission {
	public static void main(String[] args) {
		//gugudan(6);	
		//gugudan();
		
		gugudan(2, 4);
	}
	
	//오버로딩 
	public static void gugudan(int start, int end) {
		for(int i=start; i<=end; i++) {
			gugudan(i);
			System.out.println();
		}
	}
	
	public static void gugudan(int dan) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
		}
	}
	
	public static void gugudan() {
		for(int i=2; i<10; i++) {
			gugudan(i);
			System.out.println("-----------------");
		}
	}
}
