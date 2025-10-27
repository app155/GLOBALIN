package com.forexam;

public class ForExam03 {

	public static void main(String[] args) {
		
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		int i = 5;
		while (i > 0) {
			int j = 0;
			
			while (j < i) {
				System.out.print('*');
				j++;
			}
			
			System.out.println();
			i--;
		}

	}

}
