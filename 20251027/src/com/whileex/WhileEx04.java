package com.whileex;

public class WhileEx04 {

	public static void main(String[] args) {
		
		int i = 1;
		int num = 0, sum = 0;
		while (i <= 100) {
			num = i * i;
			sum += i % 2 != 0 ? -num : num;
			i++;
		}
		
		System.out.println(sum);

	}

}
