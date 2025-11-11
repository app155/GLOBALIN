package com.excep;

public class ExceptionExam {

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) {
			throw new SpaceException("설치할 공간 부족");
		}
		
		if (!enoughMemory()) {
			throw new MemoryException("메모리 공간 부족");
		}
	}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return false;
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	public static void main(String[] args) {
		
		try {
			startInstall();
			copyFiles();			
		}
		catch (SpaceException se) {
			System.out.println("에러 메세지: " + se.getMessage());
			se.printStackTrace();
			System.out.println("공간확보후 다시시도");
		}
		catch (MemoryException me) {
			System.out.println("에러 메세지: " + me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("재설치 ㄱㄱ");
		}
		finally {
			deleteTempFiles();
		}
		
	}

}
