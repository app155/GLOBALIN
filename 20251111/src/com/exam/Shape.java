package com.exam;

// 삽입삭제모두보기종료 Line Rect Circle

public abstract class Shape {
	
	private Shape next;
	
	public abstract void draw();
	
	public void setNext(Shape next) {
		this.next = next;
	}
	
	public Shape getNext() { return next; }
}
