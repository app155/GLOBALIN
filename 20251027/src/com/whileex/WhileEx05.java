package com.whileex;

public class WhileEx05 {

	public static void main(String[] args) {
		
		int i = -50;
		int cnt = 0;
		while (i <= 1) {
			cnt++;
			
			if (cnt % 5 != 0) {
				System.out.printf("%d\t", i);
			}
			else {
				System.out.printf("%d\t\n", i);
			}
			
			i++;
		}

	}

}
