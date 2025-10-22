package com.switchex;
import java.util.*;

public class SwitchEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위바위보 입력(1, 2, 3): ");
		int user = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		
		System.out.printf("사용자: %d", user);
		System.out.printf("컴퓨터: %d", com);
		
		switch (user - com) {
		case 2: case -1:
			System.out.println("사용자 패배");
			break;
		case 1: case -2:
			System.out.println("사용자 승리");
			break;
		case 0:
			System.out.println("무승부");
			break;
		default:
			System.out.println("입력 오류");
			break;
		}

	}

}
