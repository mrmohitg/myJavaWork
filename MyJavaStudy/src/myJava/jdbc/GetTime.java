package myJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;

class GetTime {
	public static void main(String... args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("create table Day (id number(3), myDate TIMESTAMP)");
			String insertRecord = "insert into Day (id,myDate) values(?,?)";
			PreparedStatement pstmt = con.prepareStatement(insertRecord);
			pstmt.setInt(1, 1);
			Time sqlDate = new Time(new java.util.Date().getTime());
			pstmt.setTime(2, sqlDate);
			pstmt.executeUpdate();
			ResultSet rs = stmt.executeQuery("select * from Day");
			while (rs.next()) {
				System.out.println(rs.getTime(2));
			}
			pstmt.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}