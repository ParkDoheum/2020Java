package kr.hkit.first.obj;

public class Car {
	protected String nm;
	protected int cc;
	
	//기본 생성자
	//1. 리턴 타입이 없다
	//2. 클래스명과 이름이 같다
	
	public Car() {
		this("소나타", 3000);
		System.out.println("Car 기본 생성자");
	}
	
	public Car(int cc) {
		this("소나타", cc);
	}
	
	public Car(String nm) {
		this(nm, 3000);
	}
	
	public Car(String nm, int cc) {
		this.nm = nm;
		if(cc < 1000 || cc > 6000) {
			cc = 3000;
		}
		this.cc = cc;
	}
	
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void printMySpec() {
		System.out.printf("나의 차 이름은 %s이고 %,dcc이다\n", nm, cc);
	}
}
