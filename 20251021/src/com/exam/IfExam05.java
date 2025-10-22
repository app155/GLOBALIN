package com.exam;
import java.util.*;

public class IfExam05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.printf("%d => 2와 3의 배수", num);
		}
		else if (num % 2 == 0) {
			System.out.printf("%d => 2의 배수", num);
		}
		else if (num % 3 == 0) {
			System.out.printf("%d => 3의 배수", num);
		}
		else {
			System.out.printf("2나 3의 배수가 아님", num);
		}
	}

}
 