package com.dbexam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


// 데이터 수정
public class JdbcEx06 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnUtil.getConnection();
			
			String sql = "UPDATE PROFESSOR SET SAL = ? WHERE NAME = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, 600);
			pstmt.setString(2, "홍길동");
			
			int result = pstmt.executeUpdate();
			System.out.printf("%d개의 행이 수정되었습니다.\n", result);
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
