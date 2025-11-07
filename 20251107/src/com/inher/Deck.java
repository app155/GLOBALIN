package com.inher;

public class Deck {
	
	final int CARD_NUM = 52;
	Card[] cards = new Card[CARD_NUM];
	
	public Deck() {
		int n = 0;
		
		for (int i = Card.KIND_MAX; i > 0; i--) {
			for (int j = 0; j < Card.NUM_MAX; j++) {
				cards[n++] = new Card(i, j + 1);
			}
		}
		
	}
	
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM);
		
		return pick(index);
	}
	
	Card pick(int index) {
		return cards[index];
	}
	
	void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int ran = (int)(Math.random() * CARD_NUM);
			
			Card tmp = cards[i];
			cards[i] = cards[ran];
			cards[ran] = tmp;
		}
	}
}
