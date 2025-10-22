package com.switchex;
import java.util.*;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int price = 0;
		
		System.out.print("커피: ");
		String order = sc.nextLine();
		
		switch (order) {
		case "에스프레소": case "카푸치노": case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("존재하지 않는 메뉴");
			break;
		}
		
		if (price != 0) {
			System.out.printf("%s는 %d원 입니다.\n", order, price);			
		}
		
	}

}
