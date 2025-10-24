package com.forexam;
import java.util.*;

public class ForExam06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수: ");
		int num = sc.nextInt();
		
		int evenSum = 0;
		int oddSum = 0;
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
			
			if (i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		
		System.out.printf("%d까지의 전체 합: %d\n", num, sum);
		System.out.printf("%d까지의 홀수 합: %d\n", num, oddSum);
		System.out.printf("%d까지의 짝수 합: %d\n", num, evenSum);

	}

}
