package learning.spring.jdbc;

import learning.spring.jdbc.model.Circle;
import learning.spring.jdbc.dao.JDBCDaoImpl;

public class JDBCDemo {

	public static void main(String[] args) {
		
		Circle circle= new JDBCDaoImpl().getCircle(1);
		System.out.println(circle.getName());;
	}

}
