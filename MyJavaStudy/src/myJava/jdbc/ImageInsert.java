package myJava.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

class ImageInsert {
	public static void main(String... args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		Statement stmt = con.createStatement();
		String sql = "create table ImageTest(name varchar(20), image BLOB)";
		stmt.executeUpdate(sql);
		File f = new File("E:\\JavaWorkbook\\MyJavaStudy\\src\\myJava\\jdbc\\worldcup2014.gif");
		FileInputStream fis = new FileInputStream(f);
		PreparedStatement pstmt = con.prepareStatement("insert into ImageTest values(?,?)");
		pstmt.setString(1, f.getName());
		pstmt.setBinaryStream(2, fis, (int) f.length());
		pstmt.executeUpdate();
		pstmt.close();
		fis.close();
		System.out.println("File Stored...");
	}
}