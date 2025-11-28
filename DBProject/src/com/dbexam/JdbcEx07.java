package com.dbexam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEx07 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = ConnUtil.getConnection();
			
			String sql = "SELECT A.NAME, A.PROFNO, A.POSITION, B.DNAME FROM PROFESSOR A, DEPARTMENT B WHERE A.DEPTNO = B.DEPTNO AND A.DEPTNO = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, 203);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String s1 = rs.getString(1);
				int i = rs.getInt(2);
				String s2 = rs.getString(3);
				String s3 = rs.getString(4);
				
				System.out.printf("%s\t%d\t%s\t%s\n", s1, i, s2, s3);
			}
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
