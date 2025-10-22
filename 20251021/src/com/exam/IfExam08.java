package com.exam;
import java.io.*;

public class IfExam08 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("알파벳 입력: ");
		char c = (char)System.in.read();
		
		if (c >= 'a' && c <= 'z') {
			c -= 32;
			System.out.println(c);
		}
		else if (c >= 'A' && c <= 'Z') {
			c += 32;
			System.out.println(c);
		}
		else {
			System.out.println("입력 오류");
		}

	}

}
