package learning.spring.annotations.sterotype_component;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring4.xml");
		
		applicationContext.registerShutdownHook();
		
		Shape myAdvCircle = (Shape) applicationContext.getBean("advanceCircle");
		myAdvCircle.draw();
	}
}
 