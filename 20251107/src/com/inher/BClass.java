package com.inher;
import java.util.*;

public class BClass extends AClass {

	//데이터 입력
	boolean input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수 입력: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.print("연산자 입력: ");
		ch = sc.next().charAt(0);
		
		return ch == '+' || ch == '-' || ch == '*' || ch == '/';
	}
	
	//연산처리
	double calc() {
		double result = 0;
		
		switch (ch) {
		case '+': 
			result = x + y; 
			break;
		case '-': 
			result = x - y; 
			break;
		case '*': 
			result = x * y; 
			break;
		case '/': 
			result = x / (double)y; 
			break;
		}
		
		return result;
	}
	
}
