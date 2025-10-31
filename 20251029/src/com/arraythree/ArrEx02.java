package com.arraythree;
import java.io.*;

public class ArrEx02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname = { "국어", "영어", "수학" };
		
		int[][][] sub = new int[2][3][subname.length + 3];
		float[][] avg = new float[2][3];
		
		for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < sub[i].length; j++) {
				for (int k = 0; k < sub[i][j].length - 3; k++) {
					
					do {
						System.out.print(subname[k] + ": ");
						sub[i][j][k] = Integer.parseInt(br.readLine());
					} while (sub[i][j][k] < 0 || sub[i][j][k] > 100);
					
					sub[i][j][sub[i][j].length - 3] += sub[i][j][k];  
				}
				
				avg[i][j] = sub[i][j][sub[i][j].length - 3] / (float)(sub[i][j].length - 3);
				sub[i][j][sub[i][j].length - 2] = 1;
				sub[i][j][sub[i][j].length - 1] = 1;
				
				System.out.println("학생");
			}
			
			System.out.println("반");
		}
		
		for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < sub[i].length; j++) {
				for (int k = 0; k < sub[i].length; k++) {
					if (sub[i][j][sub[i][j].length - 3] < sub[i][k][sub[i][k].length - 3]) {
						sub[i][j][sub[i][j].length - 2]++;
					}
				}
			}
		}
		
		// 전교석차
		for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < sub[i].length; j++) {
				for (int k = 0; k < sub.length; k++) {
					for (int l = 0; l < sub[k].length; l++) {
						if (sub[i][j][sub[i][j].length - 3] < sub[k][l][sub[k][l].length - 3]) {
							sub[i][j][sub[i][j].length - 1]++;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < sub[i].length; j++) {
				System.out.println();
				System.out.println("총점: " + sub[i][j][sub[i][j].length - 3]);
				System.out.println("평균: " + avg[i][j]);
				System.out.println("반 석차: " + sub[i][j][sub[i][j].length - 2]);
				System.out.println("전교 석차: " + sub[i][j][sub[i][j].length - 1]);
			}
		}

	}

}
