package com.exam;
import java.util.*;

public class Exam04 {

	public static void main(String[] args) {
		
		System.out.print("년도 입력: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		String s = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "윤년" : "평년";
		
		System.out.printf("%d년 => %s", year, s);

	}

}
