package com.methodexam;
import java.util.*;

public class MethodExam03 {

	public static int getInt(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.print(str + ": ");
		int i = sc.nextInt();
		return i;
	}
	
	public static void main(String[] args) {
		
		int kor = getInt("국어");
		System.out.println(kor);

	}

}
