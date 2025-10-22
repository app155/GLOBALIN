package com.exam;
import java.util.*;

public class IfExam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력: ");
		int year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.printf("%d년 => 윤년", year);
		}
		else {
			System.out.printf("%d년 => 평년", year);
		}
		

	}

}
