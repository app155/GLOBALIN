package com.exam;
import java.io.*;

/*
 * 			사용자로부터 이름, 국어, 영어, 수학 점수를 입력받아 총점과 평균을 구하기. (평균은 소수점 2자리까지 출력)
 */

public class Exam01 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.print("이름입력: ");
		String name = br.readLine();
		System.out.print("국어점수: ");
		int kScore = Integer.parseInt(br.readLine());
		System.out.print("영어점수: ");
		int eScore = Integer.parseInt(br.readLine());
		System.out.print("수학점수: ");
		int mScore = Integer.parseInt(br.readLine());
		
		int total = kScore + eScore + mScore;
		double avg = total / 3.0;
		
		System.out.printf("이름: %s\n", name);
		System.out.printf("총점: %d점\n", total);
		System.out.printf("평균: %.2f\n", avg);

	}

}
