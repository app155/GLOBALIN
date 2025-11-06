package com.exam;
import java.util.*;

/*
 * 그룹 객체배열
    예약, 검색, 취소, 종료 기능 구현
    reserve(), search(), cancel(), finish()
    run() 실행기능
 */

public class Concert {

	private Group[] groups = new Group[3];
	private Scanner sc = new Scanner(System.in);
	
	public Concert() {
		groups[0] = new Group('S');
		groups[1] = new Group('A');
		groups[2] = new Group('B');
	}
	
	public void reserve() {
		System.out.print("좌석구분 S(1), A(2), B(3): ");
		int rankNum = sc.nextInt();
		
		if (rankNum < 1 || rankNum > 10) {
			System.out.println("잘못된 좌석등급입니다.");
			return;
		}
		
		groups[rankNum - 1].display();
		
		System.out.printf("\t");
		
		for (int i = 0; i < groups[rankNum - 1].seatNum; i++) {
			System.out.printf("  %d  ", i + 1);
		}
		
		System.out.println();
		
		System.out.printf("이름: ");
		String name = sc.next();
		System.out.printf("번호: ");
		int seatNum = sc.nextInt();
		
		if (seatNum < 1 || seatNum > 10) {
			System.out.println("잘못된 좌석번호입니다.");
			return;
		}
		
		groups[rankNum - 1].reserve(seatNum - 1, name);
	}
	
	public void search() {
		for (int i = 0; i < groups.length; i++)	{
			groups[i].display();
		}
	}
	
	public void cancel() {
		System.out.print("좌석구분 S(1), A(2), B(3): ");
		int rankNum = sc.nextInt();
		
		groups[rankNum - 1].display();
		System.out.print("\t");
		for (int i = 0; i < groups[rankNum - 1].seatNum; i++) {
			System.out.printf("  %d  ", i + 1);
		}
		
		System.out.println();
		
		System.out.print("이름: ");
		String name = sc.next();
		
		if (!groups[rankNum - 1].cancel(name)) {
			System.out.printf("%s는 잘못된 이름입니다.\n", name);
		}
	}
	
	public void finish() {
		System.out.println("프로그램 종료.");
		System.exit(0);
	}
	
	public void run() {
		System.out.println("글로벌 인 콘서트 예약 프로그램");
		
		while (true) {
			System.out.print("1.예약, 2.조회, 3.취소, 4.종료 => ");
			int command = sc.nextInt();
			
			switch(command) {
			case 1:
				reserve();
				break;
			case 2:
				search();
				break;
			case 3:
				cancel();
				break;
			case 4:
				finish();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
	
}
