package com.methodex;

public class MyMathEx {

	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		
		long r1 = mm.add(30L, 11L);
		long r2 = mm.substract(30L, 11L);
		long r3 = mm.multiply(30L, 11L);
		double r4 = mm.divide(30, 11);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

	}

}
