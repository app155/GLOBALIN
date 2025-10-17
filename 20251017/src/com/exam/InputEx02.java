package com.exam;
import java.io.*;

public class InputEx02 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("숫자 입력: ");
		// int num = System.in.read() - 48;
		int num = System.in.read() - '0';
		
		System.out.println(num);

	}

}
