package com.chainedexceptionex;

public class ExceptionMain {
	
	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		} 
		catch (SpaceException se) {
			InstallException ie = new InstallException("설치 중 문제발생");
			ie.initCause(se); // 설치 중 예외가 발생한 원인 예외로 등록
			throw ie;
		}
		catch (MemoryException me) {
			InstallException ie = new InstallException("설치 중 문제발생");
			ie.initCause(me);
			throw ie;
		}
		finally {
			deleteTempFiles();
		}
	}

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) {
			throw new SpaceException("공간부족");
		}
		
		if (!enoughMemory()) {
			throw new MemoryException("메모리부족");
		}
	}
	
	static void copyFiles() {
		
	}
	
	static void deleteTempFiles() {
		
	}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return false;
	}
	
	
	public static void main(String[] args) {
		try {
			install();
		}
		catch(InstallException ie) {
			ie.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
