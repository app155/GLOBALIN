package com.operexam;
import java.util.*;

public class OperEx08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		String s;
		
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		
		s = n % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println(n + "=> " + s);

	}

}
