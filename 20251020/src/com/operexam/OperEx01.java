package com.operexam;
import java.io.*;

public class OperEx01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x, y, c, d, e, f, g;
		
		System.out.print("첫 번째 정수: ");
		x = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수: ");
		y = Integer.parseInt(br.readLine());
		
		c = x + y;
		d = x - y;
		e = x * y;
		f = x / y;
		g = x % y;
		
		System.out.println();
		System.out.printf("%d + %d = %d\n", x, y, c);
		System.out.printf("%d - %d = %d\n", x, y, d);
		System.out.printf("%d * %d = %d\n", x, y, e);
		System.out.printf("%d / %d = %d\n", x, y, f);
		System.out.printf("%d %% %d = %d\n", x, y, g);

	}

}
