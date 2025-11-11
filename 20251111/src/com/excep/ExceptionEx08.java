package com.excep;
import java.io.*;

public class ExceptionEx08 {

	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals("")) {
				throw new Exception("존재하지 않는 파일명");
			}
		} 
		catch (Exception e) {
			fileName = "제목없음.txt";
		}
		finally {
			File file = new File(fileName);
			createFile(file);
			return file;
		}
	}
	
	static void createFile(File file) {
		try {
			file.createNewFile(); // 파일 생성
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			File file = createFile(args[0]);
			System.out.printf("%s 파일이 성공적으로 생성됨\n", file.getName());			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage() + "다시 입력해");
		}

	}

}
