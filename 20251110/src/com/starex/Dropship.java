package com.starex;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("드랍십 이동 좌표 x: %d, y: %d\n", x, y);
	}

	@Override
	void stop() {
		System.out.printf("드랍십 대기\n");
		
	}

	@Override
	void message() {
		System.out.printf("드랍십 메세지\n");
		
	}
	
	void load() {
		System.out.printf("모든 마린 탑승\n");
	}
	
	void unload() {
		System.out.printf("모든 마린 강하\n");
	}

}
