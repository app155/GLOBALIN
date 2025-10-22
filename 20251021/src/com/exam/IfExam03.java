package com.exam;
import java.util.*;

public class IfExam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("%d => 짝수", num);
		}
		else {
			System.out.printf("%d => 홀수", num);
		}

	}

}
