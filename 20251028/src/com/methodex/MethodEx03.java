package com.methodex;
import java.io.*;

public class MethodEx03 {
	
	public static int aaa() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 정수: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두번째 정수: ");
		int b = Integer.parseInt(br.readLine());
		
		return a >= b ? a : b;
	}
	
	public static void bbb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 정수: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두번째 정수: ");
		int b = Integer.parseInt(br.readLine());
		int sum = 0;
		
		if (a > b) {
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
		}
		
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		
		System.out.printf("%d부터 %d까지의 합: %d\n", a, b, sum);
	}
	
	public static String ccc(int x, int y, int z) {
		if(x < y) {
			x = x ^ y;
			y = x ^ y;
			x = x ^ y;
		}
		if(x < z) {
			x = x ^ z;
			z = x ^ z;
			x = x ^ z;
		}
		if(y < z) {
			y = y ^ z;
			z = y ^ z;
			y = y ^ z;
		}
		
		String str = x + " > " + y + " > " + z;
		return str;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = 0;
		
		while(true) {
			System.out.print("1.최댓값, 2.사이의 합, 3.큰 수 나열, 4.종료 :");
			
			x = Integer.parseInt(br.readLine());
			
			if(x == 1) {
				int k = aaa();
				System.out.printf("두 수 중 더 큰 수는 %d\n", k);
			}
			else if(x == 2) {
				bbb();
			}
			else if(x == 3) {
				System.out.print("첫번째 정수: ");
				int a = Integer.parseInt(br.readLine());
				System.out.print("두번째 정수: ");
				int b = Integer.parseInt(br.readLine());
				System.out.print("세번째 정수: ");
				int c = Integer.parseInt(br.readLine());
				
				System.out.println(ccc(a, b, c));
			}
			else if(x == 4) {
				System.out.println("종료");
				System.exit(0);
			}
			else {
				System.out.println("잘못된 입력.");
			}
			
			System.out.println();
		}

	}

}
