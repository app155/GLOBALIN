package com.two.forexam;
import java.util.*;

public class ForExam01 {

	public static void main(String[] args) {
		
		// 별찍기------------------------------------------------

		Scanner sc = new Scanner(System.in);
		System.out.print("높이 입력: ");
		int height = sc.nextInt();
		int mid = height / 2;
		char c = ' ';

		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for (int i = 0; i < height; i++) {
			for (int j = i; j < height; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 
		 * *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 */
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height * 2 - 1; j++) {
				c = j >= height * 2 - 1 - i || j < i ? ' ' : '*';
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println();

		/*
		 * 
		 *     *    
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 */
		
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height * 2 - 1; j++) {
				c = j < height - i - 1 || j > height + i - 1 ? ' ' : '*';
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 
		 * *       *
		 * **     **
		 * ***   ***
		 * **** ****
		 * *********
		 * **** ****
		 * ***   ***
		 * **     **
		 * *       * 
		 */
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height; j++) {
				if (i < mid) {
					c = i - j >= 0 || height - i - j - 1 <= 0 ? '*' : ' ';					
				}
				else {
					c = i + j < height || j - i >= 0 ? '*' : ' '; 
				}
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 
		 * *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 */
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height; j++) {
				if (i < mid) {
					c = j >= height - i || j < i ? ' ' : '*';					
				}
				else {
					c = i + j < height - 1 || j - i >= 1 ? ' ' : '*'; 
				}
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height; j++) {
				c = j < i ? ' ' : '*';
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height; j++) {
				c = j >= height - i - 1 ? '*' : ' ';
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println();

		/*
		 * 	*****
		 * 	 ****
		 * 	  ***
		 * 	   **
		 * 	    *
		 * 	   **
		 * 	  ***
		 * 	 ****
		 * 	*****
		 */

		 for (int i = 0; i < height; i++) {
			for (int j = 0; j < (height + 1) / 2; j++) {
				if (i < mid) {
					c = j >= i ? '*' : ' ';
				}
				else {
					c = j >= height - 1 - i ? '*' : ' ';
				}

				// 8	4
				// 4 - 3~
				// 9	mid 4 /2 + 1 5
				// 4 - 4
				// 5 - 3 4
				// 6 - 2 3 4
				// 7 - 1 2 3 4
				// j >= height + 1 - i
				
				System.out.print(c);
			}
			
			System.out.println();
		}

		System.out.println();
		
		/*
		 * 
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < (height + 1) / 2; j++) {
				if (i < mid) {
					c = j >= (height + 1) / 2 - i - 1 ? '*' : ' ';
				}
				else {
					c = mid - i + j >= 0 ? '*' : ' ';
				}
				
				System.out.print(c);
			}
			
			System.out.println();
		}

		System.out.println();
		
		// 구구단----------------------------------------------------------------------
		
		
		System.out.print("수 입력: ");
		int num = sc.nextInt();
		
		for (int i = 2; i <= 9; i += num) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 0; k < num; k++) {
					if (i + k <= 9) {
						System.out.printf("%d x %d = %d\t", i + k, j, (i + k) * j);						
					}
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
