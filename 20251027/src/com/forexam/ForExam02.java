package com.forexam;

public class ForExam02 {

	public static void main(String[] args) {
		
		/*
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (i == j) {
					System.out.printf("[%d, %d]", i, j);					
				}
				else {
					System.out.printf("%6c", ' ');
				}
			}
			
			System.out.println();
		}
		*/
		
		int i = 0, j;
		
		while (i <= 5) {
			j = 0;
			
			while (j <= 5) {
				if (i == j) {
					System.out.printf("[%d, %d]", i, j);		
				}
				else {
					System.out.printf("%6c", ' ');
				}
				
				j++;
			}
			
			System.out.println();
			i++;
		}

	}

}
