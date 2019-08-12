package myJava.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class BlobClobEx {
	public static void main(String... args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@loacalhost:1521:xe", "system", "oracle");
		Statement stmt = con.createStatement();
		createBlobClobTables(stmt);
		PreparedStatement pstmt = con.prepareStatement("Insert into BlobClob values(40,?,?)");
		File file = new File("Blob.txt");
		FileInputStream fis = new FileInputStream(file);
		pstmt.setBinaryStream(1, fis, (int) file.length());
		file = new File("Clob.txt");
		fis = new FileInputStream(file);
		pstmt.setAsciiStream(2, fis, (int) file.length());
		fis.close();
		pstmt.execute();
		ResultSet rs = stmt.executeQuery("select * from BlobClob where id =40");
		rs.next();
		java.sql.Blob blob = rs.getBlob(2);
		java.sql.Clob clob = rs.getClob(3);
		byte blobVal[] = new byte[(int) blob.length()];
		InputStream blobs = blob.getBinaryStream();
		blobs.read(blobVal);
		// System.out.println(s);
		blobs.close();
		char clobval[] = new char[(int) clob.length()];
		Reader r = clob.getCharacterStream();
		r.read(clobval);
		String sw = new String(clobval);
		System.out.println(sw);
		r.close();
		con.close();
	}

	public static void createBlobClobTables(Statement stmt) throws Exception {
		String sql = "create table BlobClob(id number(3), b Blob, c Clob)";
		try {
			stmt.executeUpdate("drop table BlobClob");
		} catch (SQLException se) {
			if (se.getErrorCode() == 942)
				System.out.println("Error dropping Blob Clob table: " + se.getMessage());
			if (stmt.executeUpdate(sql) == 0)
				System.out.println("BlobClob table created...");
		}
	}
}