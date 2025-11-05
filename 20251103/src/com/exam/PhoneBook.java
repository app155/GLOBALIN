package com.exam;
import java.util.*;

public class PhoneBook {

	private Scanner sc = new Scanner(System.in);
	private Phone[] phones;
	
	public static void main(String[] args) {
		
		PhoneBook pb = new PhoneBook();
		
		pb.registerNumber();
		
		while (true) {
			System.out.println(pb.searchNum());			
		}
		
	}
	
	void registerNumber() {
		System.out.print("인원 수: ");
		phones = new Phone[sc.nextInt()];
		
		for (int i = 0; i < phones.length; i++) {
			System.out.print("이름과 전화번호(빈칸없이 입력): ");
			
			String name = sc.next();
			String num = sc.next();
			phones[i] = new Phone(name, num);
		}
		
		System.out.println("저장되었습니다.");
	}
	
	String searchNum() {
		System.out.print("검색할 이름: ");
		String name = sc.next();
		String s = name + "은 없습니다.";
		
		for (int i = 0; i < phones.length; i++) {
			if (phones[i].getName().equals(name)) {
				s = phones[i].getName() + "의 전화번호: " + phones[i].getNumber();
				break;
			}
		}
		
		return s;
	
	}

}
