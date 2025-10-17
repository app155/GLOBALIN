package com.exam;
import java.util.Scanner;

/*
 * 			사용자로부터 이름, 도시, 나이, 체중, 독신여부를 입력받고 출력.
 */


public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("도시: ");
		String city = sc.nextLine();
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.print("체중: ");
		double weight = sc.nextDouble();
		
		System.out.print("독신여부 (맞다면 true): ");
		boolean isSingle = sc.nextBoolean();
		
		System.out.printf("이름은 %s, 도시는 %s, 나이 %d살, 체중은 %.1fkg, 독신여부는 %s입니다.", name, city, age, weight, isSingle);

	}

}
