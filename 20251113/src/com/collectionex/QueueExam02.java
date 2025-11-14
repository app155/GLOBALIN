package com.collectionex;
import java.util.*;

public class QueueExam02 {
	
	static String[] rain = { "111", "222", "333" };

	public static void main(String[] args) {
		
		Queue<Object> q = new LinkedList<>();
		
		String str = "EEE";
		
		q.offer("AAA");
		q.offer("BBB");
		q.offer("CCC");
		q.offer("DDD");
		q.offer(str);
		
		Queue<String> queue = new LinkedList<>();
		
		for (String ra : rain) {
			queue.offer(ra);
		}
		
		while (queue.peek() != null) {
			System.out.print(queue.poll() + " ");
		}
		
		System.out.println();
		System.out.println();
		
		while (q.peek() != null) {
			System.out.print(q.poll() + " ");
		}

	}

}
