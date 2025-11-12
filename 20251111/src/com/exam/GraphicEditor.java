package com.exam;
import java.util.*;

public class GraphicEditor {
	
	private Shape head;
	private Shape tail;
	private String name;
	
	public GraphicEditor(String name) {
		this.name = name;
	}
	
	void push(int com) {
		if (com < 1 || com > 3) {
			return;
		}
		
		Shape shape = null;
		
		switch (com) {
		case 1:
			shape = new Line();
			break;
		case 2:
			shape = new Rect();
			break;
		case 3:
			shape = new Circle();
			break;
		}
		
		if (head == null) {
			head = shape;
			tail = shape;
		}
		
		else {
			tail.setNext(shape);
			tail = shape;
		}
	}
	
	void delete(int num) {
		int count = 1;
		
		Shape prev = head;
		Shape current = head;
		
		while (count < num) {
			if (current == null)
				return;
			
			count++;
			prev = current;
			current = current.getNext();
		}
		
		if (current == head && current == tail) {
			head = null;
			tail = null;
		}
		
		else if (current == head) {
			head = current.getNext();
		}
		
		else if (current == tail) {
			tail = prev;
		}
		
		else {
			prev.setNext(current.getNext());
		}
		
	}
	
	void showAll() {
		Shape now = head;
		
		while (now != null) {
			now.draw();
			now = now.getNext();
		}
	}
	
	void shutOff() {
		System.exit(0);
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("그래픽 에디터 %s 실행\n", name);
		int command = 0;
		
		while (command != 4) {
			System.out.print("1. 삽입, 2. 삭제, 3. 모두보기, 4. 종료: ");
			command = sc.nextInt();
			
			switch (command) {
			case 1:
				System.out.print("1. Line, 2. Rect, 3. Circle: ");
				push(sc.nextInt());
				break;
			case 2:
				System.out.print("삭제할 번호: ");
				delete(sc.nextInt());
				break;
			case 3:
				showAll();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("ASDF");
		ge.run();
	}

}
