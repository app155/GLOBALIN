package com.exam;
import java.io.*;

public class Exam01 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("숫자 입력: ");
		int num = System.in.read() - '0';
		String s = num == 1 ? "남성" : "여성";
		
		System.out.println(s);

	}

}
