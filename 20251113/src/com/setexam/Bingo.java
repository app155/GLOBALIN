package com.setexam;
import java.util.*;

public class Bingo {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		int[][] board = new int[5][5];
		
		for (int i = 0; i < 25; i++) {
			set.add((int)(Math.random() * 50) + 1);
		}
		
		Iterator<Integer> it = set.iterator();
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				
			}
			System.out.println();
		}
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);									
				}
			}
			System.out.println();
		}

	}

