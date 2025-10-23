package com.switchex;
import java.util.*;

public class SwitchEx07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		System.out.print("연산자: ");
		char oper = sc.next().charAt(0);
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		
		int result = 0;
		
		switch (oper) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		}
		
		System.out.printf("%d %c %d = %d\n", num1, oper, num2, result);

	}

}
