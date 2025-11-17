package com.exam;
import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("나라, 인구입력: ");
			String nation = sc.next();
			
			if (nation.equals("그만")) {
				break;				
			}
			
			int popul = sc.nextInt();
			
			
			
			map.put(nation, popul);
		}
		
		System.out.println();
		
		while (true) {
			System.out.print("인구검색: ");
			String nation = sc.next();
			
			if (nation.equals("그만"))
				break;
			
			if (!map.containsKey(nation)) {
				System.out.printf("%s는 없음\n", nation);
				continue;
			}
			
			System.out.printf("%s: %d명\n", nation, map.get(nation));
		}

	}

}
