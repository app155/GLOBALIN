package com.excep;

public class ExceptionEx05 {
	
	public static void main(String[] args) {
		try {
			// Exception e = new Exception("고의");
			// throw e;
			
			throw new Exception("고의");
		}
		catch (Exception e) {
			System.out.println("에러: " + e.getMessage());
		}
		System.out.println("프로그램 정상 종료.");
	}
}
