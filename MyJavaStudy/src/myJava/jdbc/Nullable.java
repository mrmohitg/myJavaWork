package myJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

class Nullable {
	public static void main(String... args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select id, name from Employee");
		ResultSetMetaData rsmd = rs.getMetaData();
		int nullability = rsmd.isNullable(1);
		if (nullability == ResultSetMetaData.columnNullable)
			System.out.println("Columns ID can have a null value.");
		else if (nullability == ResultSetMetaData.columnNoNulls)
			System.out.println("Columns ID doesn't allow null values.");
		else if (nullability == ResultSetMetaData.columnNullableUnknown)
			System.out.println("Nullability Unknown");
	}
}