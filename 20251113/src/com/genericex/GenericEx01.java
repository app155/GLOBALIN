package com.genericex;

class Box<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}

public class GenericEx01 {

	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>();
		
		iBox.set(10);
		int i = iBox.get();
		System.out.println(i);
		
		Box<String> sBox = new Box<>();
		
		sBox.set("Love");
		String str = sBox.get();
		System.out.println(str);
		
		Box<Character> cBox = new Box<>();
		
		cBox.set('A');
		char c = cBox.get();
		System.out.println(c);
	}

}
