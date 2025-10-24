package com.two.forexam;
import java.util.*;

public class ForExam01 {

	public static void main(String[] args) {
		
		// 별------------------------------------------------
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 1.
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 7.
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */
		
		char c = ' ';
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				c = j >= 5 - i - 1 ? '*' : ' ';
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 6.
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				c = j < i ? ' ' : '*';
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 3.
		 *     *    
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 */
		
		int mid = 9 / 2;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				c = j < mid - i || j > mid + i ? ' ' : '*';
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 2.
		 * *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				c = j >= 9 - i || j < i ? ' ' : '*';
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 4.
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
		
		mid = 9 / 2;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i <= mid) {
					c = i - j >= 0 || 9 - i - j - 1 <= 0 ? '*' : ' ';					
				}
				else {
					c = i + j < 9 || j - i >= 0 ? '*' : ' '; 
				}
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 5.
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
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i <= mid) {
					c = j >= 9 - i || j < i ? ' ' : '*';					
				}
				else {
					c = i + j < 9 - 1 || j - i >= 1 ? ' ' : '*'; 
				}
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 10.
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
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (i <= mid) {
					c = j >= mid - i ? '*' : ' ';				
				}
				else {
					// i 5 j 0
					// i 6 j 0 1
					c = mid + j < i ? ' ' : '*';
				}
				
				System.out.print(c);
			}
			System.out.println();
		}
		
		// 구구단----------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
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
