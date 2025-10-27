package com.whileex;
import java.util.*;

public class WhileEx06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		String str = "";
		
		while (true) {
			System.out.print("1-콜라, 2-사이다, 3-마운틴, 4-초코송이, 5-에이스, 6-웨하스, 0-종료");
			n = sc.nextInt();
			
			switch (n) {
			case 0:
				System.out.println("프로그램을 종료.");
				return;
			case 1:
				str = "콜라";
				break;
			case 2:
				str = "사이다";
				break;
			case 3:
				str = "마운틴";
				break;
			case 4:
				str = "초코송이";
				break;
			case 5:
				str = "에이스";
				break;
			case 6:
				str = "웨하스";
				break;
			default:
				System.out.println("선택한 상품은 없음.");
				break;
			}
		}

	}

}
