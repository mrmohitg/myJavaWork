package learning.spring.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring3.xml");
		
		applicationContext.registerShutdownHook();
		
		Shape myAdvCircle = (Shape) applicationContext.getBean("advCircle19");
		myAdvCircle.draw();
	}
}
 