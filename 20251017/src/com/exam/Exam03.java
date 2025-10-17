package com.exam;
import java.io.*;

public class Exam03 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.print("첫번째 정수: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("연산자: ");
		char op = br.readLine().charAt(0);
		System.out.print("두번째 정수: ");
		int num2 = Integer.parseInt(br.readLine());
		
		switch (op) {
		case '+':
			System.out.printf("%d %c %d = %d", num1, op, num2, num1 + num2);
			break;
		case '-':
			System.out.printf("%d %c %d = %d", num1, op, num2, num1 - num2);
			break;
		case '*':
			System.out.printf("%d %c %d = %d", num1, op, num2, num1 * num2);
			break;
		case '/':
			System.out.printf("%d %c %d = %f", num1, op, num2, num1 / (double)num2);
			break;
		}

	}

}
