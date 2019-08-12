package myJava.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetDate {
	public static void main(String... args) {
		PreparedStatement pstmp = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("create table Birthday (id number(3),myDate DATE DEFAULT(sysdate))");
			String insertRecord = "insert into Birthday(id,myDate) values(?,?)";
			pstmp = con.prepareStatement(insertRecord);
			pstmp.setString(1, "1");
			Date sqlDate = new Date(new java.util.Date().getTime());
			pstmp.setDate(2, sqlDate);
			pstmp.executeUpdate();
			ResultSet rs = stmt.executeQuery("select * from Birthday");
			while (rs.next()) {
				System.out.println(rs.getDate(2));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}