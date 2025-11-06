package com.exam;

/*
 *  reserve(),cancel() : 예약, 취소 기능
      isOccupied() : 좌석이 예약되어 있는지를 판별
      match()  : 예약자가 있는지를 판별
 */

public class Seat {
	
	private String reserver;
	
	public void reserve(String name) {
		if (isOccupied()) {
			System.out.println("이미 예약된 좌석");
		}
		else {
			reserver = name;
		}
	}
	
	public String getReserver() {
		return reserver;
	}
	
	public void cancel(String name) {
		System.out.println(name + "취소완료");
		reserver = null;
	}
	
	public boolean isOccupied() {
		return reserver != null;
	}
	
	public void match() {
		if (isOccupied()) {
			System.out.printf("%s님의 좌석입니다.\n", reserver);
		}
		else {
			System.out.println("빈 좌석입니다.");
		}
	}

}
