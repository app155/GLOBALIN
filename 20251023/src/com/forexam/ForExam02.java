package com.forexam;
import java.util.*;

public class ForExam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int cnt = 1;
		
		for (int i = 0; i < 1; i = 0) {
			System.out.print("양의 실수: ");
			double num = sc.nextDouble();
			
			if (num < 0) {
				System.out.printf("지금까지의 평균: %f", sum / cnt);
				break;
			}
			
			sum += num;
			cnt++;
		}

	}

}
