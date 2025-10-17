package com.exam;

/*
 * 			ASCII 코드 입력 받기
 * 				System.in.read();
 */

// import java.io.IOException;
import java.io.*;
import java.util.*;

public class InputEx01 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아스키 코드 입력: ");
		// int i = System.in.read();
		int i = sc.nextInt();
		// System.in.skip(2);
		System.out.print("문자 입력: ");
		// char c = (char)System.in.read();
		char c = sc.next().charAt(0);
		
		System.out.print("문자열 입력: ");
		String s = sc.next();
		
		// System.out.println("아스키 코드 값: " + i);
		// System.out.println("아스키 코드 값: " + (char)i);
		System.out.println("아스키 코드 값: " + i);
		System.out.println("문자: " + c);
		System.out.println("문자열: " + s);

	}

}
