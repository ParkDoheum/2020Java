package kr.hkit.first.except;

import java.io.BufferedReader;
import java.io.FileReader;

public class ExceptClass {
	public BufferedReader getCon() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("나없는파일"));
			br.readLine();
		} catch(Exception e) {
			
			
		}
		return br;
	}
}
