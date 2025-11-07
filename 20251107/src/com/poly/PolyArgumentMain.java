package com.poly;

public class PolyArgumentMain {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈: " + b.money);
		System.out.println("현재 포인트: " + b.bonusPoint);

	}

}
