package com.switchex;
import java.io.*;

public class SwitchEx05 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, mat, sum = 0;
		float avg = 0.0f;
		char grade = ' ';
		
		System.out.print("국어: ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어: ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학: ");
		mat = Integer.parseInt(br.readLine());
		
		sum = kor + eng + mat;
		avg = sum / 3.0f;
		
		switch ((int)(avg / 10)) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
			
		}
		
		System.out.printf("총점: %d\n", sum);
		System.out.printf("평균: %.2f\n", avg);
		System.out.printf("학점: %c\n", grade);

	}

}
