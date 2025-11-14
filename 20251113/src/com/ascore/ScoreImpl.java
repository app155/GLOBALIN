package com.ascore;
import java.util.*;

public class ScoreImpl implements Score {

	private List<ScoreVO> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		
		for (ScoreVO temp : list) {
			if(temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}
		
		return vo;
	}
	
	@Override
	public void insert() {
		System.out.println("\n 자료추가");
		
		String hak;
		System.out.print("학번입력: ");
		hak = sc.next();
		
		ScoreVO temp = readScore(hak);
		
		if (temp != null) {
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
		
		list.add(vo);
		System.out.println("자료추가완료");

	}

	@Override
	public void update() {
		System.out.println("\n 자료수정");
		
		String hak;
		System.out.print("수정학번입력: ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if (vo == null) {
			System.out.println("없는 학번");
			return;
		}
		
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
		
		ScoreVO vo = readScore(hak);
		
		if (vo == null) {
			System.out.println("없는 학번");
			return;
		}
		
		list.remove(vo);
	}

	@Override
	public void listAll() {
		System.out.println("\n 전체출럭");
		Iterator<ScoreVO> it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();

	}

	@Override
	public void searchHak() {
		System.out.println("\n 학번검색");
		
		String hak;
		System.out.print("검색학번입력: ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
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
		
		for (ScoreVO vo : list) {
			if (vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		}
	}

}
