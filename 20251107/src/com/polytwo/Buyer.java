package com.polytwo;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	
	Product[] item = new Product[10];
	int i = 0;
	
	void buy(Product p) {
		
		if (money < p.price) {
			System.out.println("잔액부족");
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		item[i++] = p;
		
		System.out.println(p + " 구매 성공.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				break;
			
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		
		System.out.println("구입 제품 총 금액 " + sum + "만원");
		System.out.println("구입 제품은 " + itemList);
	}

}
