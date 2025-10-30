package com.arrayexam;
import java.util.*;

public class ArrayExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		if (args.length != 1) {
			System.exit(0);
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]= " + args[i]);
		}

	}

}
