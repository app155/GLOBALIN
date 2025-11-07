package com.polythree;
import java.util.*;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	
	Vector item = new Vector();
	
	void buy(Product p) {
		
		if (money < p.price) {
			System.out.println("잔액부족");
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		item.add(p);
		
		System.out.println(p + " 구매 성공.");
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + " 반품 성공.");
		}
		else {
			System.out.println("구입 제품 중 " + p + " 없음.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if (item.isEmpty()) {
			System.out.println("구입 제품 없음.");
			return;
		}
		
		for (int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			
			sum += p.price;
			itemList += i == item.size() - 1 ? p : p + ", ";
		}
		
		System.out.println("구입 제품 총 금액 " + sum + "만원");
		System.out.println("구입 제품은 " + itemList);
	}

}
