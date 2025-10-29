package com.methodexam;
import java.util.*;

public class MethodExam02 {
	
	public static String getString(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.print(str + ": ");
		String name = sc.next();
		return name;
	}

	public static void main(String[] args) {
		
		String name = getString("이름");
		System.out.println(name);

	}

}
