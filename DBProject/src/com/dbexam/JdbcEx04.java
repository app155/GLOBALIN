package com.dbexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

// 데이터 조회
public class JdbcEx04 {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
			// System.out.println("데이터베이스가 성공적으로 연결되었습니다.");
			
			// Statement 객체 가져오기
			stmt = con.createStatement();
			
			/*
			 * 	실행하려는 쿼리문이 SELECT문일 경우,
			 * 	쿼리실행의 결과집합을 리턴받을 수 있는 ResultSet객체에 executeQuery()를 활용
			 * 
			 * 	rs = stmt.executeQuery(query);
			 * 
			 * 	ResultSet 객체로부터 데이터를 추출,
			 * 	ResultSet의 next()메소드는 커서를 다음행으로 이동시켜 데이터가 존재하는지의 여부를 판단
			 * 	next()의 값이 참일경우 계속 데이터 추출
			 * 
			 * 	rs의 getXXX(컬럼 위치), getXXX(컬럼 이름)을 사용하여 컬럼의 값을 추출
			 * 
			 */
			
			String sql = "SELECT * FROM DEPARTMENT";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int i = rs.getInt(1);
				String s1 = rs.getString(2);
				int j = rs.getInt("college");
				String s2 = rs.getString("loc");
				
				System.out.printf("%d\t%s\t%d\t%s\n", i, s1, j, s2);
			}
			
		}
		catch (ClassNotFoundException ne) {
			ne.printStackTrace();
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
		finally {
			try {
				if (rs != null) {
					rs.close();
				}				
			}
			catch (SQLException se) {
				se.printStackTrace();
			}
			
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
