package com.forexam;
import java.util.*;

public class DoWhileEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, total;
		double avg;
		char grade;
		
		do {
			System.out.print("국어점수 입력: ");
			kor = sc.nextInt();
		} while (kor < 0 || kor > 100);
		
		do {
			System.out.print("영어점수 입력: ");
			eng = sc.nextInt();
		} while (eng < 0 || eng > 100);
		
		do {
			System.out.print("수학점수 입력: ");
			mat = sc.nextInt();
		} while (mat < 0 || mat > 100);
		
		total = kor + eng + mat;
		avg = total / 3.0;
		
		if (avg >= 90) {
			grade = 'A';
		}
		else if (avg >= 80) {
			grade = 'B';
		}
		else if (avg >= 70) {
			grade = 'C';
		}
		else if (avg >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		
		System.out.printf("총점: %d\n", total);
		System.out.printf("평균: %.3f\n", avg);
		System.out.printf("학점: %c\n", grade);
	}

}
