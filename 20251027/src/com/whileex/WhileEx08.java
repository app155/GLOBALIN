package com.whileex;
import java.io.*;

public class WhileEx08 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int subject;
		
		while (true) {
			System.out.print("점수: ");
			subject = Integer.parseInt(br.readLine());
			
			if (subject < 0 || subject > 100) {
				System.out.println("0 ~ 100 사이로 입력.");
			}
			else {
				break;
			}
		}
		
		do {
			System.out.print("점수: ");
			subject = Integer.parseInt(br.readLine());
			
			if (subject < 0 || subject > 100) {
				System.out.println("0 ~ 100 사이로 입력.");
			}
			
		} while (subject < 0 || subject > 100);

	}

}
