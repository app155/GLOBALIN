package com.exam;
import java.io.*;

/*
 *			문자열 입력 받기
 *				InputStreamReader is = new InputStreamReader(System.in);
 *				BufferedReader br = new BufferedReader(is);
 */


public class InputEx03 {

	public static void main(String[] args) throws IOException {
		
		// InputStreamReader is = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(is);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력: ");
		String name = br.readLine();
		
		System.out.print("번호 입력: ");
		String tel = br.readLine();
		
		System.out.print("나이 입력: ");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println(name);
		System.out.println(tel);
		System.out.println(age);

	}

}
