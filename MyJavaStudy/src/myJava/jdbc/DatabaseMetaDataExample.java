package myJava.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

class DatabaseMetaDataExample {
	public static void main(String... args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println(dbmd.getDriverName());
			ResultSet rs = dbmd.getTables(null, null, null, new String[] { "Table" });
			while (rs.next()) {
				System.out.println(rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
