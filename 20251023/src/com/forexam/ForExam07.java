package com.forexam;
import java.util.*;

public class ForExam07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력: ");
		int num = sc.nextInt();
		
		if (num < 2 || num > 9) {
			System.exit(0);
		}
		
		else {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", num, i, num * i);
			}
		}

	}

}
