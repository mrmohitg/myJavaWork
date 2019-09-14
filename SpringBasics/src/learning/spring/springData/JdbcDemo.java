package learning.spring.springData;

import learning.spring.springData.model.Circle;
import learning.spring.springData.dao.JdbcDaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JdbcDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring9.xml");
		
		JdbcDaoImpl jdi = context.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		
		/*Circle circle= jdi.getCircle(1);
		System.out.println(circle.getName());;*/
		
		/*List<Map<String,Object>> s = jdi.getCircleCount();
		for (Map<String, Object> map : s) {
			System.out.println(map.toString());
		}*/
		
		
		/*System.out.println(jdi.getCircleName(1));;
		
		
		System.out.println(jdi.getCircleForId(1).getName());
		
		System.out.println(jdi.getAllCircles().size());;
		
		jdi.insertCircle(new learning.spring.springData.model.Circle(2,"Anurag"));*/
		
		System.out.println(jdi.getAllCircles().size());
		
		//jdi.createTriangleTable();
		
		//jdi.insertCircleViaNamedParameter(new Circle(4, "Papa"));
	}

}
