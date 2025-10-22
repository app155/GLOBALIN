package com.exam;
import java.util.*;


public class IfExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 			System : 클래스
		 * 			fields (멤버변수)
		 * 				in : (System.in) => InputStream과 연결된 객체로 키보드로부터 입력을 처리.
		 * 				out : (System.out) => PrintStream과 연결된 객체로 콘솔로 출력을 처리.
		 * 				err : (System.out) => PrintStream과 연결된 객체로 콘솔로 출력할 수 이으나 일반적으로 여러 메시지를 표시할 때 사용. 
		 */
		
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.printf("첫번째 정수(%d)가 두번째 정수(%d)보다 큽니다.", num1, num2);
		}
		else if (num1 < num2) {
			System.out.printf("첫번째 정수(%d)가 두번째 정수(%d)보다 작습니다.", num1, num2);
		}
		else {
			System.out.printf("첫번째 정수(%d)가 두번째 정수(%d)와 같습니다.", num1, num2);
		}
	}

}
