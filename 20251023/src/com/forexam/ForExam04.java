package com.forexam;
import java.util.*;

public class ForExam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1: ");
		int num1 = sc.nextInt();
		System.out.print("정수 2: ");
		int num2 = sc.nextInt();
		int sum = 0;
		
		if (num1 > num2) {
			num1 = num1 ^ num2;
			num2 = num2 ^ num1;
			num1 = num1 ^ num2;
		}
		
		for (int i = num1; i <= num2; i++) {
			System.out.printf("%d%c", i, i < num2 ? '+' : '=');
			sum += i;
		}
		
		System.out.println(sum);

	}

}
