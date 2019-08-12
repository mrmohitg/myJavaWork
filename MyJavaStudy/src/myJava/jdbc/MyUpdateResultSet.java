package myJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class MyUpdateResultSet {
	public static void main(String... args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("select * from Bank");
		System.out.println(rs);
		while (rs.next()) {
			if (rs.getInt(1) == 100) {
				rs.updateInt(3, 2000);
				rs.updateRow();
				System.out.println("Record Updated Successfully");
			}
			System.out.println("Account No: " + rs.getInt(1));
			System.out.println("Name : " + rs.getString(2));
			System.out.println("Balance : " + rs.getInt(3));
		}
	}
}