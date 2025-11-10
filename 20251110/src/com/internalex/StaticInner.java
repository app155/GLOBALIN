package com.internalex;

public class StaticInner {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	/*
	 * 		이너클래스를 static으로 선언해야하는 경우.
	 * 			이너클래스의 멤버 중 하나라도 static인 경우.
	 */
	
	static class Inner {
		static int d = 1000;
		public void printData() {
			// System.out.println("int a: " + a);
			// System.out.println("private int b: " + b);
			System.out.println("static int c: " + c);
			System.out.println("int d: " + d);
		}
	}

	public static void main(String[] args) {
		StaticInner.Inner inner = new StaticInner.Inner();
		
		inner.printData();

	}

}
