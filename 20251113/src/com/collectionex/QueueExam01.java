package com.collectionex;
import java.util.*;

/*
 * 		큐 (Queue)
 * 			- 선입선출 (FIFO) 구조 => 먼저 입력된 자료가 먼저 출력됨.
 * 			- 인스턴스를 생성하기 위해 new 연산자를 이용해 큐를 구현한 클래스의 생성자를 호출하여 객체를 생성함
 */

public class QueueExam01 {

	public static void main(String[] args) {
		
		Queue<Object> q = new LinkedList<>();
		
		q.offer("AAA");
		q.offer("BBB");
		q.offer("CCC");
		q.offer("DDD");
		
		System.out.println(q.element());
		System.out.println(q.element());
		
		String s;
		
		while (q.peek() != null) {
			s = (String)q.poll();
			System.out.println(s);
		}

	}

}
