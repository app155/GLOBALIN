package com.exam;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.run();

	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수와 연산자 입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char op = sc.next().charAt(0);
		
		Calc cal;
		
		switch (op) {
		case '+':
			cal = new Add(num1, num2);
			System.out.println(cal.calculate());
			break;
		case '-':
			cal = new Sub(num1, num2);
			System.out.println(cal.calculate());
			break;
		case '*':
			cal = new Mul(num1, num2);
			System.out.println(cal.calculate());
			break;
		case '/':			
			cal = new Div(num1, num2);
			System.out.println(cal.calculate());
			break;
		}
	}

}
