package com.whileex;
import java.io.*;

public class WhileEx09 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = 0, num2 = 0, result = 0;
		char oper = ' ';
		
		while (true) {
			System.out.print("첫번째 수: ");
			num1 = Integer.parseInt(br.readLine());
			
			do {
				System.out.print("연산자 입력: ");
				oper = (char)System.in.read();
				System.in.skip(2);
			} while (oper != '+' && oper != '-' && oper != '*' && oper != '/' && oper != '%');
			
			
			while (true) {
				System.out.print("두번째 수: ");
				num2 = Integer.parseInt(br.readLine());
				
				if ((oper == '/' || oper == '%') && num2 == 0) {
					System.out.println("0으로 나누기 불가능");
					continue;
				}
				break;
			}
			
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
			
			do {
				System.out.println("계속 진행? Y/N");
				oper = (char)System.in.read();
				System.in.skip(2);
			} while (!(oper == 'Y' || oper == 'y' || oper == 'N' || oper == 'n'));
			
			if (oper == 'n' || oper == 'N') {
				System.out.println("프로그램 종료.");
				break;
			}			
			
		}

	}

}
