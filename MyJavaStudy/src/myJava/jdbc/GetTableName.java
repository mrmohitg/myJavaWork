package myJava.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class GetTableName {
	public static void main(String... args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		Statement stmt = con.createStatement();
		getTable(con);
		stmt.close();
		con.close();
	}

	public static void getTable(Connection con) throws Exception {
		String TABLE_NAME = "TABLE_NAME";
		String TABLE_SCHEMA = "TABLE_SCHEMA";
		String[] TABLES_TYPES = { "TABLE" };
		// String[] TABLES_TYPES = {"TABLE","VIEW"};
		// String[] TABLES_TYPES = {"VIEW"};
		DatabaseMetaData dbmd = con.getMetaData();
		ResultSet tables = dbmd.getTables(null, null, null, TABLES_TYPES);
		while (tables.next()) {
			System.out.println(tables.getString(3));
			System.out.println(tables.getString(TABLE_NAME));
			//System.out.println(tables.getString(TABLE_SCHEMA));
		}
	}
}