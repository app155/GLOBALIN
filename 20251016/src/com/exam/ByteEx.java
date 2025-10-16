package com.exam;

/*
 * 		byte:	1byte 크기의 자료형.
 * 				범위는 -128 ~ 127
 */


public class ByteEx {

	public static void main(String[] args) {
		byte bb = 127;
		//bb = bb + 1;	=> Java에서는 컴파일 시 에러를 발생시킴.
		bb++;				// 초기화 후 증감연산자에 의한 증감은 에러 발생하지 않음.
		
		System.out.println(bb);
		
	}

}
