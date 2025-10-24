package com.forexam;
import java.util.*;

public class ForExam08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.printf("%d\t", i * 3);
		}

	}

}
