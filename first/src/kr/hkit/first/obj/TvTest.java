package kr.hkit.first.obj;

public class TvTest {

	public static void main(String[] args) {
		Tv.company = "삼성";
		
		Tv tv1 = new Tv();
		tv1.nm = "파브";
		tv1.inch = 52;
		
		
		Tv tv2 = new Tv();
		tv2.nm = "엑스캔버스";
		tv2.inch = 60;
		
		tv1.print();
		tv2.print();

	}

}
