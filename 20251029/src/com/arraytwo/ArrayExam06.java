package com.arraytwo;
import java.io.*;


public class ArrayExam06 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생 수: ");
		int student = Integer.parseInt(br.readLine());
		
		String[] name = new String[student];
		
		String[][] subject = new String[student][];
		int[][] score = new int[student][];
		
		float[] avg = new float[student];
		char[] grade = new char[student];
		int[] rank = new int[student];
		
		for (int i = 0; i < student; i++) {
			System.out.print("이름: ");
			name[i] = br.readLine();
			
			System.out.print("과목 수: ");
			int subNum = Integer.parseInt(br.readLine());
					
			subject[i] = new String[subNum];
			
			for (int j = 0; j < subject[i].length; j++) {
				System.out.printf("%d번째 과목: ", j + 1);
				subject[i][j] = br.readLine();
			}
			
			score[i] = new int[subNum + 1];
			
			for (int j = 0; j < subject[i].length; j++) {
				System.out.printf("%s 점수: ", subject[i][j]);
				score[i][j] = Integer.parseInt(br.readLine());
				
				score[i][score[i].length - 1] += score[i][j];
			}
			
			avg[i] = score[i][score[i].length - 1] / (float)(score[i].length - 1);
			avg[i] = (int)((avg[i] + 0.005) * 100) / 100.f;
			
			switch ((int)(avg[i] / 10)) {
			case 10: 
			case 9: grade[i] = 'A'; break;
			case 8: grade[i] = 'B'; break;
			case 7: grade[i] = 'C'; break;
			case 6: grade[i] = 'D'; break;
			default: grade[i] = 'F'; break;
			}
			
			System.out.println();
		}
		
		for (int i = 0; i < student; i++) {
			rank[i] = 1;
			for (int j = 0; j < student; j++) {
				if (avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		
		for (int i = 0; i < student; i++) {
			System.out.printf("------------------ %s -------------------\n", name[i]);
			System.out.printf("이름\t");
			
			for (int j = 0; j < subject[i].length; j++) {
				System.out.printf("%s\t", subject[i][j]);
			}
			
			System.out.printf("총점\t평균\t학점\t석차\n");
			System.out.print(name[i] + "\t");
			
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
			}
			
			System.out.printf("%.3f\t%c\t%d", avg[i], grade[i], rank[i]);
			
			System.out.println();
		}

	}

}
