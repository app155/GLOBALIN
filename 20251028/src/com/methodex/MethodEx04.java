package com.methodex;
import java.io.*;

public class MethodEx04 {
	
	static int add(int x, int y) {
		return x + y;
	}
	
	static int substract(int x, int y) {
		return x - y;
	}
	
	static int multiply(int x, int y) {
		return x * y;
	}
	
	static double divide(double x, double y) {
		return x / y;
	}
	
	static int remainder(int x, int y) {
		return x % y;
	}
	
	static void printResult(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2;
		char oper;
		String str = "";
		
		do {
			
			System.out.print("첫번째 수: ");
			num1 = Integer.parseInt(br.readLine());
			System.out.print("연산자: ");
			oper = br.readLine().charAt(0);
			System.out.print("두번째 수: ");
			num2 = Integer.parseInt(br.readLine());
		
			str = num1 + " " + oper + " " + num2 + " = ";
		
			switch (oper) {
			case '+': str += add(num1, num2); break;
			case '-': str += substract(num1, num2); break;
			case '*': str += multiply(num1, num2); break;
			case '/': str += divide((double)num1, (double)num2); break;
			case '%': str += remainder(num1, num2); break;
			}
			
		} while (oper != '+' && oper != '-' && oper != '*' && oper != '/' && oper != '%');
		
		printResult(str);

	}

}
