package com.exam;
import java.io.*;

public class IfExam07 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("문자 입력: ");
		int input = System.in.read();
		char c = (char)input;
		
		if (input >=65 && input <= 90 || input >= 97 && input <= 122) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c== 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				System.out.printf("%c는 모음", c);
			}
			
			else {
				System.out.printf("%c는 자음", c);
			}
		}
		else {
			System.out.println("입력 오류");
		}

	}

}
