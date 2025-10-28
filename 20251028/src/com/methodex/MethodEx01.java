package com.methodex;

public class MethodEx01 {
	
	int add (int x, int y) {
		return x + y;
	}
	
	static int showMenu() {
		return 0;
	}
	
	static void inputRecord() {
		
	}
	
	static void changeRecord() {
		
	}
	
	static void deleteRecord() {
		
	}
	
	static void searchRecord() {
		
	}
	
	static void showRecordList() {
		
	}
	
	static void print99All() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d", i, j, i * j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		// add(10, 20);
		
		MethodEx01 m = new MethodEx01();
		int r = m.add(10, 20);
		
		System.out.println(r);
		
		switch (showMenu()) {
		case 1: inputRecord(); break;
		case 2: changeRecord(); break;
		case 3: deleteRecord(); break;
		case 4: searchRecord(); break;
		default: showRecordList(); break;
		}

	}

}
