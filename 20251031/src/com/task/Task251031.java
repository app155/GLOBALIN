package com.task;
import java.io.*;

public class Task251031 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("높이: ");
		int height = Integer.parseInt(br.readLine()); 
		System.out.print("너비: ");
		int width = Integer.parseInt(br.readLine());

		System.out.println("--------------------문 1---------------------");

		// 문 1
		int[][] arr1 = new int[height][];

		for (int i = 0; i < height; i++) {
			arr1[i] = new int[i + 1];

			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = i * (i + 1) / 2 + j + 1;
				System.out.printf("%d\t", arr1[i][j]);
			}

			System.out.println();
		}

		System.out.println("--------------------문 2---------------------");
		
		// 문 2
		int[][] arr2 = new int[height][width];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				arr2[i][j] = i % 2 == 0 ? i * width + j + 1 : (i + 1) * width - j;
				System.out.printf("%d\t", arr2[i][j]);
			}

			System.out.println();
		}

		System.out.println("--------------------문 3---------------------");

		// 문 3
		int[][] arr3 = new int[height][width];

		for (int i = width - 1; i >= 0; i--) {
			for (int j = height - 1; j >= 0; j--) {
				arr3[j][i] = (width - i - 1) * height + height - j;
			}
		}

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.printf("%d\t", arr3[i][j]);
			}

			System.out.println();
		}

		System.out.println("--------------------문 4---------------------");

		// 문 4
		int[][] arr4 = new int[height][width];

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				arr4[j][i] = i * height + j + 1;
			}
		}

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.printf("%d\t", arr4[i][j]);
			}

			System.out.println();
		}

		System.out.println("\"--------------------문 5---------------------\"");

		// 문 5
		int[][] arr5 = new int[height][];

		for (int i = 0; i < height; i++) {
			arr5[i] = new int[height - i];

			for (int j = 0; j < arr5[i].length; j++) {
				arr5[i][j] = height * i - (i * (i - 1)) / 2 + j + 1;
			}
		}

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.printf("%d\t", arr5[i][j]);
			}

			System.out.println();
		}
	}

}
