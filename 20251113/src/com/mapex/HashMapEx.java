package com.mapex;
import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		while (true) {
			System.out.println("아이디 비밀번호 입력");
			System.out.print("ID: ");
			String id = sc.next();
			System.out.print("PW: ");
			String pw = sc.next();
			
			if (!map.containsKey(id)) {
				System.out.println("존재하지 않는 ID");
				continue;
			}
			
			if (!map.get(id).equals(pw)) {
				System.out.println("일치하지 않는 비밀번호");
			}
			
			else {
				System.out.println("아이디 비밀번호 일치");
				break;
			}
		}

	}

}
