package com.ex;

public class Ex06 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(' ');
			}
			
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print('*');
			}
			
			System.out.println();
		}
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(' ');
			}
			
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print('*');
			}
			
			System.out.println();
		}
	}

}
