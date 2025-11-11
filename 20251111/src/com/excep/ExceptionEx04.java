package com.excep;

public class ExceptionEx04 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}
		catch (ArithmeticException ae) {
			
			System.out.println(ae.getMessage());
			ae.printStackTrace();
			/*
			 * 	printStackTrace()
			 * 		- 예외발생 당시의 호출스택(api)에 있었던 메소드의 정보와 예외 메시지를 화면에 출력
			 * 
			 * 	getMessage()
			 * 		- 발생한 예외 클래스의 인스턴스에 저장된 메시지를 가져옴.
			 */
			
//			if (ae instanceof ArithmeticException) {
//				System.out.println("true");
//			}
//			System.out.println("ArithmeticException");
//			System.out.println(5);
		}
		catch (Exception e) {
			System.out.println("Exception!");
		}
		System.out.println(6);

	}

}
