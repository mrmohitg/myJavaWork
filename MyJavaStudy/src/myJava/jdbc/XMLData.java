package myJava.jdbc;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class XMLData {

	static Connection connection = null;
	
	public static void main(String[] args) {
		PreparedStatement preparedStatement = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			connection = DriverManager.getConnection(url, "system", "oracle");
			statement = connection.createStatement();
			createXMLtable(statement);
			
			File file = new File("XML_Data.xml");
			long filelength = file.length();
			
			FileInputStream fis = new FileInputStream(file);
			
			String sql = "insert into XML_DATA values (?,?)";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, 100);
			preparedStatement.setAsciiStream(2, fis,(int)filelength);
			preparedStatement.execute();
			preparedStatement.close();
			
			
			sql = "select data from XML_Data where id = 100";
			resultSet = statement.executeQuery(sql);
			if(resultSet.next())
			{
				InputStream xmlInputStream = resultSet.getAsciiStream(1);
				int c;
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				while((c = xmlInputStream.read())!= -1)
					baos.write(c);
				System.out.println(baos.toString());
			}
			resultSet.close();
			preparedStatement.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try
			{
				if(statement != null)
				{
					statement.close();
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			try 
			{
				if(connection != null)
				{
					connection.close();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void createXMLtable(Statement statement) throws SQLException {

		System.out.println("Creating XML_Data Table");
		String streamingDataSql = "create table XML_Data(id INTEGER,Data Long)";
		try {
			statement.executeUpdate("drop table XML_Data");
		} catch (Exception e) {
			System.out.println(e);
		}
		if(statement.executeUpdate(streamingDataSql)>1)
		{
			System.out.println("Table XML_Data created successfully.");
		}
		
	}
}
