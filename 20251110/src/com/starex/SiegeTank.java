package com.starex;

public class SiegeTank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("탱크 이동 좌표 x: %d, y: %d\n", x, y);
	}

	@Override
	void stop() {
		System.out.printf("탱크 대기\n");
	}

	@Override
	void message() {
		System.out.println("Message: Go, siege");
	}
	
	void changeMode() {
		System.out.println("Mode Change");
	}

}
