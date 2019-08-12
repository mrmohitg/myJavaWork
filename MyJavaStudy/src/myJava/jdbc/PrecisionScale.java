package myJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

class PrecisionScale {
	public static void main(String... args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		Statement stmt = con.createStatement();
		String query = "select stockid, name, price from Stocks";
		ResultSet rs = stmt.executeQuery(query);
		ResultSetMetaData rsmd = rs.getMetaData();
		int precesion = rsmd.getPrecision(3);
		int scale = rsmd.getScale(3);
		System.out.println("Precision = " + precesion);
		System.out.println("Scale = " + scale);
	}
}