package learning.spring.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;

import learning.spring.jdbc.model.Circle;

public class JDBCDaoImpl {
	
	public Circle getCircle(int circleId)
	{
		Connection connection = null;
		
		String driver = "org.apache.derby.jdbc.ClientDriver";
		try {
		Class.forName(driver).newInstance();
		connection = DriverManager.getConnection("jdbc:derby://localhost:1527/HibernateDB;create=true");
		PreparedStatement ps =  connection.prepareStatement("select * from circle where id = ?");
		ps.setInt(1, circleId);
		
		Circle circle = null;
		
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			circle = new Circle(circleId, rs.getString("name"));
		}
		rs.close();
		ps.close();
		
		return circle;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		
	}

}
