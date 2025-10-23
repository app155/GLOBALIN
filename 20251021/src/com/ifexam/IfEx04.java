package com.ifexam;
import java.util.*;

public class IfEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a, b;
		
		System.out.print("가위바위보 입력: ");
		a = sc.next();
		System.out.print("가위바위보 입력: ");
		b = sc.next();
		
		if (a.equals("가위")) {
			if (b.equals("가위")) {
				System.out.println("비김");
			}
			else if (b.equals("바위")) {
				System.out.println("b 승리");
			}
			else {
				System.out.println("a 승리");
			}
		}
		else if (a.equals("바위")) {
			if (b.equals("가위")) {
				System.out.println("a 승리");
			}
			else if (b.equals("바위")) {
				System.out.println("비김");
			}
			else {
				System.out.println("b 승리");
			}
		}
		else {
			if (b.equals("가위")) {
				System.out.println("b 승리");
			}
			else if (b.equals("바위")) {
				System.out.println("a 승리");
			}
			else {
				System.out.println("비김");
			}
		}

	}

}
