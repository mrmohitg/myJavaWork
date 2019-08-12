package myJava.jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DBLogger {
	public static void main(String... args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.setLogWriter(new PrintWriter("LogFile.log"));
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		con.setAutoCommit(false);
		Statement stmt = con.createStatement();
		try {
			stmt.executeUpdate("create table Survey (id number(3),name varchar(30))");
			stmt.executeUpdate("insert into Survey values(1,'lalu')");
			stmt.executeUpdate("insert into Survey values(2,'rabri')");
			// Commits all the transactions.
			con.commit();
		} catch (Exception e) {
			con.rollback();
			System.out.println(e);
		}
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Survey");
		outputResultset(rs);
		rs.close();
		stmt.close();
		con.close();
	}

	private static void outputResultset(ResultSet rs) throws Exception {
		ResultSetMetaData rsmd = rs.getMetaData();
		int numberOfColumns = rsmd.getColumnCount();
		for (int i = 1; i < numberOfColumns + 1; i++) {
			String columnName = rsmd.getColumnName(i);
			System.out.println(columnName + "");
			while (rs.next()) {
				for (i = 1; i < numberOfColumns + 1; i++) {
					System.out.println(rs.getString(i) + " ");
				}
			}
		}
	}
}
