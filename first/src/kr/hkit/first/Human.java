package kr.hkit.first;

public class Human {
	//멤버 필드 (속성, 전역 변수)
	int age;
	private String name;
	private String sex;
	private float height;
	private float weight;
	
	static String nation;
	
	void study() {
		System.out.println("에서 공부중");
		run();
	}
	
	public void run() {
		System.out.println(nation + "에서 뛴다");
	}
	//싱글톤 (SingleTon)
}
