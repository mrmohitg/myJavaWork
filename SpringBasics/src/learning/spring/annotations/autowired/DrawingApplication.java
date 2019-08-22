package learning.spring.annotations.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
		
		/*Shape myAdvTriangle = (Shape)applicationContext.getBean("advtriangle17");
		myAdvTriangle.draw();*/
		
		Shape myAdvCircle = (Shape)applicationContext.getBean("advtriangle18");
		myAdvCircle.draw();
	}
}
 