package com.operexam;

public class OperEx06 {

	public static void main(String[] args) {
		
		int x = 20, y = 23;
		
		System.out.printf("x = %d, y = %d\n", x, y);
		
		/*
		int tmp = 0;
		tmp = x;
		x = y;
		y = tmp;
		 */
		
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		
		
		System.out.printf("x = %d, y = %d\n", x, y);

	}

}
