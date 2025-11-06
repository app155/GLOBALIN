package com.exam;
import java.util.*;

//        등급의 좌석예약, 예약취소, 현재 등급의 좌석 출력기능구현

public class Group {
	
	public final int seatNum = 10;
	private Scanner sc = new Scanner(System.in);
	private Seat[] seats = new Seat[seatNum];
	private char rank;
	
	public Group(char rank) {
		this.rank = rank;
		
		for (int i = 0; i < seatNum; i++) {
			seats[i] = new Seat();
		}
	}
	
	public void reserve(int num, String name) {
		seats[num].reserve(name);
	}
	
	public boolean cancel(String name) {
		for (int i = 0; i < seats.length; i++) {
			if (seats[i].getReserver() != null && seats[i].getReserver().equals(name)) {
				seats[i].cancel(name);
				return true;
			}
		}
		
		return false;
	}
	
	public void display() {
		
		System.out.printf("%c:\t", rank);
		
		for (int i = 0; i < seats.length; i++) {
			if (seats[i].getReserver() != null) {
				System.out.printf("%s ", seats[i].getReserver());
			}
			else {
				System.out.printf("%s ", "ㅡㅡㅡ");
			}
		}
		
		System.out.println();
	}

}
