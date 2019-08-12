package myJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResultSetMetaDataExample {

	static Connection connection = null;
	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			connection = DriverManager.getConnection(url, "system", "oracle");
			int t1 = 124;
			String t2 = "Anurag";
			PreparedStatement preparedStatement = connection.prepareStatement("insert into Employee values(?,?)");
			preparedStatement.setInt(1, t1);
			preparedStatement.setString(2, t2);
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
			preparedStatement = connection.prepareStatement("select * from Employee where id = ?");
			preparedStatement.setInt(1, t1);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			java.sql.ResultSetMetaData rsmd = resultSet.getMetaData();
			int column = rsmd.getColumnCount();
			System.out.println("Number of column is "+column);
			for (int i = 1; i <= column; i++) {
				System.out.println(rsmd.getColumnType(i) +" "+ rsmd.getColumnName(i));
			}
			
			ResultSet resultSet1 = preparedStatement.executeQuery();
			while(resultSet1.next())
			{
				System.out.println(resultSet1.getString(1));
				System.out.println(resultSet1.getString(2));
			}
			
			
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
