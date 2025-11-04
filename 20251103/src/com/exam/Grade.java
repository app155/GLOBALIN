package com.exam;
import java.util.*;

public class Grade {
	
	int kor;
	int eng;
	int mat;
	
	public Grade(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	int average() {
		return (kor + eng + mat) / 3;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 영어 수학 점수 입력: ");
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		Grade g = new Grade(kor, eng, mat);
		System.out.println("평균: " + g.average());
		
	}

}
