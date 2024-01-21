package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PsDemo {

	public static void main(String[] args) {
		 Connection conn = DBUtil.getDBConnection();
			/*
			 * String insert = "insert into dept values(?,?,?);"; try {
			 * 
			 * PreparedStatement pstmt = conn.prepareStatement(insert); pstmt.setInt(1, 90);
			 * pstmt.setString(2, "Logistics"); pstmt.setString(3, "Noida"); int count =
			 * pstmt.executeUpdate(); System.out.println(count);
			 * 
			 * } catch (SQLException e) { e.printStackTrace(); } finally { try { if (conn !=
			 * null) { conn.close(); } } catch (SQLException e) { e.printStackTrace(); } }
			 */
		 
			/*
			 * String update = "update dept set dname = ?, location = ? where dno = ?;"; try
			 * {
			 * 
			 * PreparedStatement pstmt = conn.prepareStatement(update); pstmt.setString(1,
			 * "Tours & Travels"); pstmt.setString(2, "Greater Noida"); pstmt.setInt(3,90);
			 * int count = pstmt.executeUpdate();
			 * System.out.println(count+" Record Updated.");
			 * 
			 * } catch (SQLException e) { e.printStackTrace(); } finally { try { if (conn !=
			 * null) { conn.close(); } } catch (SQLException e) { e.printStackTrace(); } }
			 */
		 
		 
		// String selectByID = "select dno,dname,location from dept where dno = ?;";
		
		/*
		 * String selectAll = "select dno,dname,location from dept;"; try {
		 * 
		 * PreparedStatement pstmt = conn.prepareStatement(selectAll); //
		 * pstmt.setInt(1,10); ResultSet rs = pstmt.executeQuery(); while(rs.next()) {
		 * System.out.println(rs.getInt("dno")+" "+rs.getString("dname")+" "+rs.
		 * getString("location")); }
		 * 
		 * 
		 * } catch (SQLException e) { e.printStackTrace(); } finally { try { if (conn !=
		 * null) { conn.close(); } } catch (SQLException e) { e.printStackTrace(); } }
		 */
		 
		 
		 String deleteById = "delete from dept where  dno = ?;";
		 try {
			 
			 PreparedStatement pstmt = conn.prepareStatement(deleteById);
			 pstmt.setInt(1,70);
			 int c = pstmt.executeUpdate();
			 System.out.println(c+" Record Deleted.");
			

			 
		 }
		 catch (SQLException e) {
	            e.printStackTrace();
	        }
		 finally {
	            try {
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }

	}

}
