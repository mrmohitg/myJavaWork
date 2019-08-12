package myJava.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

class MyBatchCallableStatement {
	public static void main(String... args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		CallableStatement cstmt = con.prepareCall("{call recins(?,?)}");
		cstmt.setString(1, "Rahul");
		cstmt.setInt(2, 2200);
		cstmt.addBatch();
		cstmt.setString(1, "Ramit");
		cstmt.setInt(2, 2000);
		cstmt.addBatch();
		int[] updateCounts = cstmt.executeBatch();
		System.out.println(updateCounts);
	}
}