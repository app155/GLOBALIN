package com.ifexam;
import java.util.*;

public class IfEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int n = sc.nextInt();
		
		if (n == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.println("입력하신 숫자는 " + n + "입니다.");
		}

	}

}
