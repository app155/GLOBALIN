package com.starex;

public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("마린 이동 좌표 x: %d, y: %d\n", x, y);
	}

	@Override
	void stop() {
		System.out.printf("마린 대기\n");
		
	}

	@Override
	void message() {
		System.out.println("Message: Standing back");
		
	}
	
	void stimPack() {
		System.out.println("마린 스팀팩");
	}

}
