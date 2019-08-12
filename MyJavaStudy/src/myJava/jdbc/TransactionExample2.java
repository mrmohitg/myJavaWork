package myJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

class TransactionExample2 {
	public static void main(String... args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			Statement stmt = con.createStatement();
			con.setAutoCommit(false);
			stmt.executeUpdate("update Employee set Name='Anurag' where Salary=40000");
			stmt.executeUpdate("insert into Employee values(125,'Shivani',3000)");
			Savepoint sp = con.setSavepoint("aaa");
			stmt.executeUpdate("delete from Employee where Name='Yasho'");
			stmt.executeUpdate("insert into Employee values(126,'Rahul',48333)");
			con.rollback(sp);
			// con.releaseSavePoint(sp);
			con.commit();
			ResultSet rs = stmt.executeQuery("select * from Employee");
			while (rs.next()) {
				System.out.println("Name:" + rs.getString(2));
				System.out.println("Salary:" + rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}