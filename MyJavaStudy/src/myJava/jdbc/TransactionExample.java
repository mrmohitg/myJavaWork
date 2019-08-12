package myJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class TransactionExample {
	public static void main(String... args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			Statement stmt = con.createStatement();
			con.setAutoCommit(false);
			stmt.executeUpdate("update Employee set Name='Mohit' where Salary=40000");
			con.commit();
			ResultSet rs = stmt.executeQuery("select * from Employee where Salary=40000");
			while (rs.next()) {
				System.out.print("Name:" + rs.getString(2)+" ");
				System.out.println("Salary:" + rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
