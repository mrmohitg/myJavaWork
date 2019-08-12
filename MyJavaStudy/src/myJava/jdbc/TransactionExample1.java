package myJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class TransactionExample1 {
	public static void main(String... args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			Statement stmt = con.createStatement();
			con.setAutoCommit(false);
			stmt.executeUpdate("update Employee set Name='Rohit' where Salary=40000");
			ResultSet rs = stmt.executeQuery("select * from Employee where Salary=40000");
			while (rs.next()) {
				System.out.print("Name:" + rs.getString(1)+" ");
				System.out.println("Salary:" + rs.getString(2));
			}
			con.rollback();
			System.out.println("After Rollback");
			ResultSet rs1 = stmt.executeQuery("select * from Employee where Salary=40000");
			while (rs1.next()) {
				System.out.print("Name:" + rs1.getString(1)+" ");
				System.out.println("Salary:" + rs1.getString(2));
			}
			con.commit();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}