package com.excep;

public class ExceptionEx02 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for (int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 10);				
			}
			catch (ArithmeticException ae) {
				ae.getMessage();
				System.out.println("0으로 나눌 수 업습니다.");
			}
			System.out.println(result);				
		}

	}

}
