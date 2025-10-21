package com.ifexam;

/*
 * 
 *			제어문 (조건)
 *			분기문 (비교문)
 *				- 주어진 조건의 결과에 따라 실행 문장을 다르게 하여 전혀 다른 결과를 얻기 위해 사용하는 제어문. (if, switch)
 *
 *			break
 *				- 조건문을 탈출하기 위해 사용되는 제어문
 *
 *			continue
 *				- 현재 진행되는 반복횟수를 포기하고 다음으로 이동하여 처리하는 제어문
 *
 *			1. 단순 if
 *				- 수행할 문장이 하나이며, { }가 생략된 경우
 *
 *			2. 중첩 if
 *				- 조건문 내부에 또 다른 조건을 포함한 경우
 *
 *			3. 다중 if
 *				- 조건이 여러 개인 경우
 * 
 */

import java.util.*;

public class IfEx01 {

	public static void main(String[] args) {
		
		System.out.print("정수 입력: ");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("x: " + x);			
		}

	}

}
