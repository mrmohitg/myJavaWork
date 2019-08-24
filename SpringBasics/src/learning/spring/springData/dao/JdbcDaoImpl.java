package learning.spring.springData.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;

import learning.spring.springData.model.Circle;

@Component
public class JdbcDaoImpl {
	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public Circle getCircle(int circleId) {
		Connection connection = null;
		
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement("select * from circle where id = ?");
			ps.setInt(1, circleId);

			Circle circle = null;

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				circle = new Circle(circleId, rs.getString("name"));
			}
			rs.close();
			ps.close();

			return circle;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;

	}
	
	
	public List<Map<String, Object>> getCircleCount()
	{
		String sql = "select count(*) from circle";
		
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate.queryForList(sql);
		
	}
	
	
	public String getCircleName(int circleId)
	{
		String sql = "SELECT NAME FROM CIRCLE WHERE ID = ?";
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForObject(sql, String.class);
	}
	
	public Circle getCircleForId(int circleId)
	{
		String sql = "SELECT * FROM CIRCLE WHERE ID = ?";
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForObject(sql,new Object[] {circleId}, new CircleMapper());
	}
	
	
	public List<Circle> getAllCircles()
	{
		String sql = "SELECT * FROM CIRCLE";
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.query(sql, new CircleMapper());
	}
	
	
	private static final class CircleMapper implements RowMapper<Circle>
	{

		@Override
		public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			
			Circle circle = new Circle();
			circle.setId(resultSet.getInt("ID"));
			circle.setName(resultSet.getString("NAME"));
			return circle;
		}
		
	}
	
	public void insertCircle(Circle circle)
	{
		 String sql = "INSERT INTO CIRCLE (ID, NAME) VALUES (?,?)";
		 jdbcTemplate.setDataSource(getDataSource());
		 jdbcTemplate.update(sql, new Object[] {circle.getId(),circle.getName()});
	}
	
	public void createTriangleTable()
	{
		String sql = "CREATE TABLE TRIANGLE (ID INTEGER, NAME VARCHAR(20))";
		jdbcTemplate.setDataSource(getDataSource());
		jdbcTemplate.execute(sql);
	}

}
