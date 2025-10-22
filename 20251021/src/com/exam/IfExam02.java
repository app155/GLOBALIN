package com.exam;
import java.util.*;

public class IfExam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수: ");
		int num3 = sc.nextInt();
		
		if (num1 > num2) {
			num1 = num1 ^ num2;
			num2 = num2 ^ num1;
			num1 = num1 ^ num2;
		}
		if (num1 > num3) {
			num1 = num1 ^ num3;
			num3 = num3 ^ num1;
			num1 = num1 ^ num3;
		}
		if (num2 > num3) {
			num2 = num2 ^ num3;
			num3 = num3 ^ num2;
			num2 = num2 ^ num3;
		}
		
		System.out.printf("%d, %d, %d", num1, num2, num3);

	}

}
