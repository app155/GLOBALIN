package com.exam;
import java.util.*;

public class WordApp {

	private Scanner sc = new Scanner(System.in);
	private Player[] players;
	private int playersNum;
	private String nowWord = "아버지";
	private String nextWord;
	private int nowTurnIdx = 0;
	
	public static void main(String[] args) {
		WordApp app = new WordApp();
		
		app.run();
	}
	
	void run() {
		System.out.print("플레이어 수: ");
		playersNum = sc.nextInt();
		
		players = new Player[playersNum];
		
		for (int i = 0; i < playersNum; i++) {
			System.out.printf("%d번 플레이어 이름 입력: ", i + 1);
			
			players[i] = new Player(i + 1, sc.next());
		}
		
		getWordFromUser();
	}
	
	void getWordFromUser() {
		System.out.printf("%d번 %s 플레이어의 차례\n", nowTurnIdx + 1, players[nowTurnIdx].getName());
		System.out.print(nowWord + " => ");
		
		nextWord = sc.next();
		
		if (checkSuccess()) {
			nowWord = nextWord;
			turnToNextPlayer();
			getWordFromUser();
		}
		
		else {
			System.out.printf("%d번 %s 탈락\n", nowTurnIdx + 1, players[nowTurnIdx].getName());
		}
	}
	
	boolean checkSuccess() {
		return nowWord.charAt(nowWord.length() - 1) == nextWord.charAt(0);
	}
	
	void turnToNextPlayer() {
		nowTurnIdx = (nowTurnIdx + 1) % playersNum; 
	}
	
	

}
