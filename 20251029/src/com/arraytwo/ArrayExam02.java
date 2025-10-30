package com.arraytwo;
import java.io.*;

public class ArrayExam02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname = { "국어", "영어", "수학" };
		int[][] score = new int[3][subname.length + 1];
		
		float[] avg = new float[3];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length - 1; j++) {
				do {
					System.out.print(subname[j] + ": ");
					score[i][j] = Integer.parseInt(br.readLine());
				} while (score[i][j] < 0 || score[i][j] > 100);
				
				score[i][score[i].length - 1] += score[i][j];
			}
			
			avg[i] = score[i][score[i].length - 1] / (float)(score[i].length - 1);
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("총점: %d\n", score[i][score[i].length - 1]);
			System.out.printf("평균: %f\n", avg[i]);
		}

	}

}
