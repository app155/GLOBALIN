package com.exam2;
import java.util.*;

public class Game {

	public static final int FIELD_HEIGHT = 10;
	public static final int FIELD_WIDTH = 20;
	
	public static void main(String[] args) {
		Game game = new Game();
		game.run();

	}
	
	void run() {
		System.out.println("게임시작");
		
		boolean fishCaught = false;
		
		Bear bear = new Bear(0, 0, 1);
		Fish fish = new Fish(5, 5, 1);
		
		displayField(bear, fish);
		
		while (!fishCaught) {
			char com = ' ';
			
			while (com != 'w' && com != 'a' && com != 's' && com !='d'
					&& com != 'W' && com != 'A' && com != 'S' && com != 'D') {
				System.out.print("위(W) 왼쪽(A) 아래(S) 오른쪽(D): ");
				com = getInput();
			}
			
			bear.move(com);
			fishCaught = bear.collide(fish);
			
			fish.move();
			fishCaught = fish.collide(bear);
			
			displayField(bear, fish);
		}
		
		System.out.println("게임 종료");
	}
	
	char getInput() {
		Scanner sc = new Scanner(System.in);
		
		return sc.next().charAt(0);
	}
	
	void displayField(Bear bear, Fish fish) {
		
		for (int i = 0; i < FIELD_HEIGHT; i++) {
			for (int j = 0; j < FIELD_WIDTH; j++) {
				if (bear.y == i && bear.x == j || (bear.y == i && fish.y == i && bear.x == j && fish.x == j)) {
					System.out.print(bear.getShape());
				}
				
				else if (fish.y == i && fish.x == j)
					System.out.print(fish.getShape());
				
				else {
					System.out.print('-');
				}
			}
			
			System.out.println();
		}
	}
}
