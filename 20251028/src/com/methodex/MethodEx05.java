package com.methodex;

class Data {
	int x;
}

public class MethodEx05 {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main(): " + d.x);
		
		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main(): " + d.x);

	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change(): " + d.x);
	}

}
