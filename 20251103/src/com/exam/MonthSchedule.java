package com.exam;
import java.util.*;

public class MonthSchedule {
	
	private Day[] days;
	private Scanner sc = new Scanner(System.in);
	
	public MonthSchedule(int day) {
		days = new Day[day];
		
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
	}
	
	public void run() {
		System.out.print("할일 (1.입력, 2.보기, 3.종료): ");
		int command = sc.nextInt();
		
		switch (command) {
		case 1:
			input();
			break;
		case 2:
			show();
			break;
		case 3:
			finish();
			break;
		}
		
	}
	
	public void input() {
		System.out.print("날짜 (1 ~ 30): ");
		int day = sc.nextInt();
		
		System.out.print("할일 (빈칸없이 입력): ");
		days[day - 1].set(sc.next());
	}
	
	public void show() {
		System.out.print("날짜 (1 ~ 30): ");
		int day = sc.nextInt();
		
		System.out.print(day + "일의 할 일은 "); 
		days[day - 1].show();
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

	public static void main(String[] args) {
		MonthSchedule ms = new MonthSchedule(30);
		
		while (true) {
			ms.run();			
		}
	}
	

}
