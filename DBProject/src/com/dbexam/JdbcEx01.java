package com.dbexam;
import java.sql.*;

/*
 * 		JDBC를 이용한 데이터베이스 연결 순서
 * 
 * 			1. Java API 임포트
 * 				- import java.sql.*;
 * 
 * 			2. 특정 드라이버 검색
 * 				- oracle.jdbc.driver.OracleDriver
 * 
 * 			3. 데이터베이스 연결	
 * 				- Connection con = DriverManager.getConnection(url, id, password);
 * 				  oracle url => jdbc:oracle:thin:@localhost:1521:orcl,scott,tiger
 * 
 * 			4. 쿼리문 작성
 * 				- Statement Class(정적)
 * 					Statement stmt = con.createStatement();
 * 
 * 				- PreparedStatement(동적)
 * 					PreparedStatement pstmt = con.prepareStatement(query);
 * 
 * 			5. 쿼리 실행 결과 저장
 * 				5-1. 정적
 * 				- ResultSet rs = stmt.exeuteQuery(query);
 * 					질의가 SELECT 일 때,
 * 
 * 				- ResultSet rs = stmt.executeUpdate(query);
 * 					INSERT, UPDATE, DELETE
 * 
 * 
 * 				5-2. 동적
 * 				- ResultSet rs = pstmt.exeuteQuery();
 * 					질의가 SELECT 일 때,
 * 
 * 				- ResultSet rs = pstmt.executeUpdate();
 * 					INSERT, UPDATE, DELETE
 * 
 * 			6. 사용 후 연결 해제
 * 				- con.close();
 * 
 */


// 데이터 추가
public class JdbcEx01 {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			// jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
			// System.out.println("데이터베이스가 성공적으로 연결되었습니다.");
			
			// Statement 객체 가져오기
			stmt = con.createStatement();
			
			// 데이터 추가 질의어 작성
			String sql = "INSERT INTO DEPARTMENT VALUES(203, '제어계측공학과', 200, '7호관')";
			
			// 쿼리 실행 후 결과를 ResultSet에 저장
			int result = stmt.executeUpdate(sql);
			System.out.printf("%d개의 행이 추가되었습니다.\n", result);
			
		}
		catch (ClassNotFoundException ne) {
			ne.printStackTrace();
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
		finally {
			try {
				if (stmt != null) {
					stmt.close();
				}				
			}
			catch (SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if (con != null) {
					con.close();
				}				
			}
			catch (SQLException se) {
				se.printStackTrace();
			}
			
		}

	}

}
