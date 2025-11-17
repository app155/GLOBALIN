package com.mapex;
import java.util.*;

public class HashMapEx02 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("AAA", 100);
		map.put("BBB", 100);
		map.put("CCC", 80);
		map.put("DDD", 90);
		
		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름: " + e.getKey() + " 점수: " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("이름: " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int sum = 0;
		while (it.hasNext()) {
			sum += (int)it.next();
		}
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + sum / set.size());
		System.out.println("최고점: " + Collections.max(values));
		System.out.println("최저점: " + Collections.min(values));

	}

}
