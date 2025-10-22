package com.exam;
import java.util.*;

public class IfExam06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		int num1 = sc.nextInt();
		System.out.print("연산자: ");
		char op = sc.next().charAt(0);
		System.out.print("첫번째 수: ");
		int num2 = sc.nextInt();
		
		int result;
		
		if (op == '+') {
			result = num1 + num2;
		}
		else if (op == '-') {
			result = num1 - num2;
		}
		else if (op == '*') {
			result = num1 * num2;
		}
		else if (op == '/') {
			result = num1 / num2;
		}
		else {
			result = num1 % num2;
		}
		
		System.out.printf("%d %c %d = %d", num1, op, num2, result);
	}

}
