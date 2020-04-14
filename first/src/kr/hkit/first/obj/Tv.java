package kr.hkit.first.obj;

public class Tv {
	String nm;
	static String company;
	int inch;
	
	void print() {
		System.out.printf("%d인치 모델명 %s는 %s회사 제품이다\n"
			,inch, nm, company);
	}
	
	static void turnOn(String location) {
		System.out.println(location + "에서 티비는 켜졌다");
	}
}
