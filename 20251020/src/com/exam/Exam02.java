package com.exam;
import java.io.*;

public class Exam02 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("문자 입력: ");
		char c = (char)System.in.read();
		
		String s = c == '+' || c == '-' || c == '*' || c == '/' || c == '%' ? "산술연산자" : "산술연산자 아님";
		
		System.out.printf("%c는 %s",c , s);

	}

}
