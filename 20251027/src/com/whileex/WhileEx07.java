package com.whileex;
import java.io.IOException;

public class WhileEx07 {

	public static void main(String[] args) throws IOException {
		
		while (true) {
			System.out.println("asdfs!");
			System.out.print("계속 진행? Y/N");
			char ch = (char)System.in.read();
			System.in.read();
			System.in.read();
			
			if (ch == 'n' || ch == 'N') {
				break;
			}
		}

	}

}
