package com.dbexam;
import java.sql.*;

/*
 * 		동적 (PreparedStatement)
 * 			SQL의 형태는 정적과 동일하나 조건이나 변수값이 다른 문장을 바인딩 변수를 사용해 처리함으로써 항상 동일한 SQL문을 동일하게 처리할 수 있다.
 * 
 * 		PreparedStatment 객체 생성과 바인딩 변수 사용
 * 			String sql = "INSERT INTO DEPARTMENT VALUES(?, ?, ?, ?);
 * 			PreparedStatement pstmt = con.prepareStatement(sql);
 * 
 * 			바인딩 변수(?)의 개수만큼 순서대로 해당 변수와 대체될 값 지정
 * 			pstmt.setInt(1, 203);
 * 			pstmt.setString(2, "컴퓨터공학과");
 *  		pstmt.setInt(3, 200);
 *  		pstmt.setString(4, "7호관");
 */


// 데이터 추가
public class JdbcEx05 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnUtil.getConnection();
			
			String sql = "INSERT INTO PROFESSOR VALUES(?, ?, ?, ?, ?, SYSDATE, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, 9920);
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "GilDongHong");
			pstmt.setString(4, "전임교수");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 40);
			pstmt.setInt(7, 203);
			
			int result = pstmt.executeUpdate();
			System.out.printf("%d개의 행이 추가되었습니다.\n", result);
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
		finally {
			try {
				if (pstmt != null) {
					pstmt.close();
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
