package com.arrayexam;
import java.util.*;

public class ArrayExam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 학생 수: ");
		int num = sc.nextInt();
		sc.nextLine();
		String[] name = new String[num];
		String[] phoneNum = new String[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("이름 전화번호 입력: ");
			String[] info = sc.nextLine().split(" ");
			
			name[i] = info[0];
			phoneNum[i] = info[1];
		}
		
		System.out.printf("총 학생 수: %d\n", num);
		System.out.printf("이름\t전화번호\n");
		
		for (int i = 0 ; i < num; i++) {
			System.out.printf("%s\t%s\n", name[i], phoneNum[i]);
		}

	}

}
