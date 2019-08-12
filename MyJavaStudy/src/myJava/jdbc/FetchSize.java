package myJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchSize {
	public static void main(String... args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			Statement stmt = con.createStatement();
			int fetchSize = stmt.getFetchSize();
			System.out.println(fetchSize);
			stmt.setFetchSize(100);
			fetchSize = stmt.getFetchSize();
			System.out.println(fetchSize);
			ResultSet rs = stmt.executeQuery("select * from Survey");
			while (rs.next()) {
				System.out.println("ID : " + rs.getString(1));
				System.out.println("Name : " + rs.getString(2));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}