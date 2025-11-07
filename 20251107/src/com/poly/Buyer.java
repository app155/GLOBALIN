package com.poly;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		
		if (money < p.price) {
			System.out.println("잔액부족");
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		System.out.println(p + " 구매 성공.");
	}

}
