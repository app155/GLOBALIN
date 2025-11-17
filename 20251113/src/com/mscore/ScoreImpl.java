package com.mscore;
import java.util.*;

import com.ascore.ScoreVO;

public class ScoreImpl implements Score {

	//private Map<String, ScoreVO> map = new HashMap<>();
	private Map<String, ScoreVO> map = new TreeMap<>();
	private Scanner sc = new Scanner(System.in);
		
	@Override
	public void insert() {
		System.out.println("\n 자료추가");
		
		String hak;
		System.out.print("학번입력: ");
		hak = sc.next();
		
		if (map.containsKey(hak)) {
			System.out.println("이미 등록된 학번");
			return;
		}
		
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		
		System.out.print("이름: ");
		vo.setName(sc.next());
		
		System.out.print("생년월일: ");
		vo.setBirth(sc.next());
		
		System.out.print("국어점수: ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어점수: ");
		vo.setEng(sc.nextInt());

		System.out.print("수학점수: ");
		vo.setMat(sc.nextInt());
		
		map.put(hak, vo);
		System.out.println("자료추가완료");
	}

	@Override
	public void update() {
		System.out.println("\n 자료수정");
		
		String hak;
		System.out.print("수정학번입력: ");
		hak = sc.next();
		
		if (!map.containsKey(hak)) {
			System.out.println("없는 학번");
			return;
		}
		
		ScoreVO vo = map.get(hak);
		
		System.out.print("이름: ");
		vo.setName(sc.next());
		
		System.out.print("생년월일: ");
		vo.setBirth(sc.next());
		
		System.out.print("국어점수: ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어점수: ");
		vo.setEng(sc.nextInt());

		System.out.print("수학점수: ");
		vo.setMat(sc.nextInt());
	}

	@Override
	public void delete() {
		System.out.println("\n 자료삭제");
		
		String hak;
		System.out.print("삭제학번입력: ");
		hak = sc.next();
		
		if (!map.containsKey(hak)) {
			System.out.println("없는 학번");
			return;
		}
		
		map.remove(hak);
	}

	@Override
	public void listAll() {
		System.out.println("\n 전체출럭");
		Iterator<String> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			ScoreVO vo = map.get(it.next());
			System.out.println(vo);
		}
		
		System.out.println();
	}

	@Override
	public void searchHak() {
		System.out.println("\n 학번검색");
		
		String hak;
		System.out.print("검색학번입력: ");
		hak = sc.next();
		
		if (!map.containsKey(hak)) {
			System.out.println("없는 학번");
			return;
		}
		
		ScoreVO vo = map.get(hak);
		
		if (vo != null) {
			System.out.println(vo);
		}
		
		System.out.println();
	}

	@Override
	public void searchName() {
		System.out.println("\n 이름검색");
		
		String name;
		System.out.print("검색학번입력: ");
		name = sc.next();
		
		Iterator<String> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			ScoreVO vo = map.get(it.next());
			
			if (vo.getName().startsWith(name)) {
				System.out.println(vo);				
			}
		}
		
		System.out.println();
	}

}
