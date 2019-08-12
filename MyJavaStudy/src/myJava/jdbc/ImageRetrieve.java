package myJava.jdbc;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class ImageRetrieve {
	public static void main(String... args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		PreparedStatement pstmt = con.prepareStatement("select image from IMAGETEST where name = ?");
		pstmt.setString(1, "worldcup2014.gif");
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		InputStream f = rs.getBinaryStream("image");
		FileOutputStream f1 = new FileOutputStream("E:\\JavaWorkbook\\MyJavaStudy\\src\\Brazil2014.gif");
		int i = 0;
		while ((i = f.read()) != -1)
			f1.write(i);
		System.out.println("Image Retrieved");
	}
}