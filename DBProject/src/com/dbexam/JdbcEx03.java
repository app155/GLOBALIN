package com.dbexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// 데이터 삭제
public class JdbcEx03 {

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
			
			// 데이터 삭제 질의어 작성
			String sql = "DELETE FROM DEPARTMENT WHERE DEPTNO = 203";
			
			// 쿼리 실행 후 결과를 ResultSet에 저장
			int result = stmt.executeUpdate(sql);
			System.out.printf("%d개의 행이 삭제되었습니다.\n", result);
			
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
