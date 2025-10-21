package com.exam;
import java.io.*;

public class Exam03 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.print("임의의 정수: ");
		int num = Integer.parseInt(br.readLine());
		String s = num > 0 ? "양수" : num < 0 ? "음수" : "영";
		
		System.out.printf("%d => %s", num, s);

	}

}
