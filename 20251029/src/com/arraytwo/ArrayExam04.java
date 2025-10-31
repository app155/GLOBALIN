package com.arraytwo;

/*
 * 			다차원 배열 (가변배열, 비정형 배열, 레기드 배열)
 * 				1차원만 관리
 * 			
 * 			형식
 * 				int arr[][] = new int[3][];
 * 
 * 				arr[0] = new int[2];
 * 				arr[1] = new int[4];
 * 				arr[2] = new int[3];
 */

public class ArrayExam04 {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][];
		
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[2];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]: %d\t", i, j, arr[i][j]);
			}
			System.out.println();
		}

	}

}
