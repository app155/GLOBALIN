package com.forexam;
import java.util.*;

public class ForExam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, sum;
		
		System.out.printf("정수 1: ");
		num1 = sc.nextInt();
		System.out.printf("정수 2: ");
		num2 = sc.nextInt();
		sum = num1 + num2;
		
		for (;;) {
			
			System.out.printf("정수: %d\n", num1);
			System.out.printf("정수: %d\n", num2);
			System.out.printf("두 수의 합: %d\n", sum);			
			
		}

	}

}
