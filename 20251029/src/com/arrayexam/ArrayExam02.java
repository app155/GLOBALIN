package com.arrayexam;
import java.io.*;

public class ArrayExam02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname = { "국어", "영어", "수학" };
		int[] score = new int[subname.length + 1];
		float avg = 0.0f;
		
		for (int i = 0; i < score.length - 1; i++) {
			
			do {
				System.out.print(subname[i] + ": ");
				score[i] = Integer.parseInt(br.readLine());
			} while (score[i] < 0 || score[i] > 100);
			
			score[score.length - 1] += score[i];
		}
		
		avg = score[score.length - 1] / (float)(score.length - 1);
		
		System.out.println();
		System.out.println("총점: " + score[score.length - 1]);
		System.out.println("평균: " + avg);

	}

}
