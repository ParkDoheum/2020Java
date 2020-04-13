package kr.hkit.first;

public class MethodMission2 {
	public static void main(String[] args) {
		//squareStar(2); //99% void 일 확률이 높다!!!!
		triStar(15);
	}
	public static void triStar(int line) {
		String result = "";
		for(int i=1; i<=line; i++) {
			result += makeStar(i) + "\n";
		}
		System.out.println(result);
	}
	
	public static void squareStar(int line) {
		String result = "";
		for(int i=0; i<line; i++) {
			result = result + makeStar(line) + "\n";
		}
		System.out.println(result);
	}
	
	public static String makeStar(int cnt) {
		String star = "";
		for(int i=0; i<cnt; i++) {
			//star += "*";
			star = star + "*";
		}
		return star;
	}
}
