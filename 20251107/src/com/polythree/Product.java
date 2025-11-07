package com.polythree;

public class Product {
	
	int price;
	int bonusPoint;
	
	public Product() {
		price = 0;
		bonusPoint = 0;
	}
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

}
