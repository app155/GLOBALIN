package com.dbexam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 		Transaction: 논리적인 작업단위
 * 			- INSERT, UPDATE, DELETE 등의 작업을 하나의 논리적인 작업단위로 묶어 쿼리 실행시 모든 작업이 정상적으로 처리된 경우 COMMIT하여 DB에 반영하고
 * 			  쿼리 실행 중 예기치 못한 오류가 발생한 경우 ROLLBACK하여 모든 작업을 취소
 */

public class JdbcEx08 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sql1 = "INSERT INTO DEPARTMENT VALUES (?, ?, ?, ?)";
		String sql2 = "UPDATE DEPARTMENT SET DNAME = ?, LOC = ? WHERE DEPTNO = ?";
		
		try {
			con = ConnUtil.getConnection();
			con.setAutoCommit(false);
			
			// 1.
			pstmt = con.prepareStatement(sql1);
			pstmt.setInt(1, 255);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9호관");
			pstmt.executeUpdate();
			
			// 2.
			pstmt = con.prepareStatement(sql2);
			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			
			con.commit();
			System.out.println("DB에 작업이 정상적으로 반영되었습니다.");
		}
		catch (SQLException se) {
			try {
				con.rollback();
				System.out.println("DB작업이 취소됨.");
			}
			catch (SQLException se2) {
				se2.printStackTrace();
			}
			
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
