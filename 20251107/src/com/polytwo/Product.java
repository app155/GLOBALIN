package com.polytwo;

public class Product {
	
	int price;
	int bonusPoint;
	
	public Product() {
		
	}
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

}
