package com.forexam;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		int n = 0, sum = 0;
		
		while (n < 100) {
			n++;
			
			if (n % 2 == 0) {
				continue;
			}
			
			sum += n;
		}
		
		System.out.println(sum);

	}

}
