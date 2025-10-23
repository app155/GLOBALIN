package com.forexam;
import java.util.*;

public class ForExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		
		System.out.printf("0부터 %d까지의 합계: %d", num, sum);

	}

}
