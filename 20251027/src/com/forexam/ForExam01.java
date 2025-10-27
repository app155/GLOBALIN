package com.forexam;

public class ForExam01 {

	public static void main(String[] args) {
		
		char a, b;
		int c;
		for (a = 'A'; a <= 'Z'; a++) {
			for (c = 0; c < a - 65; c++) {
				System.out.print(" ");
			}
			
			for (b = 'A'; b <= 'Z' - (a - 65); b++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
