package com.dbexam;
import java.sql.*;

public class Test05 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			String sql = "select * from member";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString("name");
				String id = rs.getString("id");
				String dept = rs.getString("dept");
				
				System.out.printf("%-10s|%-10s|%-10s\n", name, id, dept);
			}
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		finally {
			try {
				if (con != null) {
					con.close();
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}
	}

}
