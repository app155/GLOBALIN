package com.operexam;

public class OperEx04 {
	
	static String toBinaryString(int x) {
		
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		
		return tmp.substring(tmp.length() - 32);
		
	}

	public static void main(String[] args) {
		
		int a = 8;
		
		System.out.printf("%d >> %d = %d \t %s\n", a, 0, a >> 0, toBinaryString(a >> 0));
		System.out.printf("%d >> %d = %d \t %s\n", a, 1, a >> 1, toBinaryString(a >> 1));
		System.out.printf("%d >> %d = %d \t %s\n", a, 2, a >> 2, toBinaryString(a >> 2));
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.printf("%d << %d = %d \t %s\n", a, 0, a << 0, toBinaryString(a << 0));
		System.out.printf("%d << %d = %d \t %s\n", a, 1, a << 1, toBinaryString(a << 1));
		System.out.printf("%d << %d = %d \t %s\n", a, 2, a << 2, toBinaryString(a << 2));
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.printf("%d >> %d = %d \t %s\n", -a, 0, -a >> 0, toBinaryString(-a >> 0));
		System.out.printf("%d >> %d = %d \t %s\n", -a, 1, -a >> 1, toBinaryString(-a >> 1));
		System.out.printf("%d >> %d = %d \t %s\n", -a, 2, -a >> 2, toBinaryString(-a >> 2));
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.printf("%d << %d = %d \t %s\n", -a, 0, -a << 0, toBinaryString(-a << 0));
		System.out.printf("%d << %d = %d \t %s\n", -a, 1, -a << 1, toBinaryString(-a << 1));
		System.out.printf("%d << %d = %d \t %s\n", -a, 2, -a << 2, toBinaryString(-a << 2));

	}

}
