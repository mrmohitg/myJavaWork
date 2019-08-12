package myJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLThinDriver {

	static Connection connection = null;

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/mysqldb";
			//String url = "jdbc:mysql://localhost:3306/mysqldb";
			connection = DriverManager.getConnection(url, "mohit", "mysqlp");
			int t1 = 123;
			String t2 = "Mohit";
			Statement statement = connection.createStatement();
			statement.executeUpdate("Create table Employee(id integer, name varchar(20))");
			statement.close();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into Employee values(?,?)");
			preparedStatement.setInt(1, t1);
			preparedStatement.setString(2, t2);
			preparedStatement.executeUpdate();
			preparedStatement.close();

			preparedStatement = connection.prepareStatement("select * from Employee where id = ?");
			preparedStatement.setInt(1, t1);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getString(2));
			}
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
