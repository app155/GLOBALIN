package com.dbexam;
import java.sql.*;
import java.util.*;
import java.io.*;

public class JdbcEx09 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		Properties pro = new Properties();
		
		try {
			pro.load(new FileInputStream("src/department.properties"));
			
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));
			
			pstmt.setInt(1, 100);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5호관");
			
			int i = pstmt.executeUpdate();
			System.out.printf("%d개의 행이 추가되었습니다.\n", i);
			
		}
		catch (IOException e) {
			e.printStackTrace();
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
