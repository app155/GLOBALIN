package com.collectionex;
import java.util.*;

public class ArrayListEx01 {
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>(10);
		list1.add(6);
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1, 4));
		
		System.out.println("정렬 전");
		print(list1, list2);
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println("정렬 후");
		print(list1, list2);
		
		System.out.println(list1.containsAll(list2));
		
		list2.add(10);
		list2.add(12);
		list2.add(3, 10);
		print(list1, list2);
		list2.add(3, 22); 
		print(list1, list2);
		
		System.out.println(list1.retainAll(list2));
		print(list1, list2);
		
		for (int i = list2.size() - 1; i >= 0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		
		print(list1, list2);

	}

}
