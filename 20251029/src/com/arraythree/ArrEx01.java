package com.arraythree;

public class ArrEx01 {

	public static void main(String[] args) {
		
		int[][][] arr = new int[2][3][4];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = 1;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.printf("%d\t", arr[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
