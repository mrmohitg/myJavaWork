package myJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class MyBatchPreparedStatement {
	public static void main(String... args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			PreparedStatement pstmt = con.prepareStatement("update Employee set salary=? where name=?");
			
			pstmt.setInt(1, 20000);
			pstmt.setString(2, "Shivani");
			pstmt.addBatch();
			// pstmt.setString(1,"Shivani");
			// pstmt.setInt(2,13000);
			// pstmt.addBatch();
			int Count[] = pstmt.executeBatch();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
