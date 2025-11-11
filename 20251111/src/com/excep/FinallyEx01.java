package com.excep;

public class FinallyEx01 {

	// 프로그램 설치 준비에 필요한 코드
	static void startInstall() {
		
	}
	
	// 파일들을 복사하는 코드
	static void copyFiles() {
		
	}
	
	// 임시파일들을 삭제하는 코드
	static void deleteTempFiles() {
		
	}
	
	static void method() {
		try {
			System.out.println("method() 호출");
			return;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("method()의 finally");
		}
	}
	
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			//deleteTempFiles();
		}
		catch (Exception e) {
			e.printStackTrace();
			//deleteTempFiles();
		}
		finally {
			deleteTempFiles();
		}
		
		method();
		System.out.println("method() 수행 완료 후 main()으로 북귀.");

	}

}
