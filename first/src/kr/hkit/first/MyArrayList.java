package kr.hkit.first;

public class MyArrayList {
	private Object[] obj = new Object[0];
	public void add(Object v) {
		Object[] temp = new Object[obj.length + 1];
		
		for(int i=0; i<obj.length; i++) {
			temp[i] = obj[i];
		}
		
		temp[obj.length] = v;
		obj = temp;
	}
	
	public void add(int idx, Object v) {
		Object[] temp = new Object[obj.length + 1];
		
		for(int i=0; i<obj.length; i++) {
			if(i < idx) {
				temp[i] = obj[i];
			} else {
				temp[i+1] = obj[i];
			}
		}
		temp[idx] = v;
		obj = temp;
	}
	
	public void showMyValues() {
		for(Object obj : obj) {
			System.out.println(obj);
		}
	}
}





























