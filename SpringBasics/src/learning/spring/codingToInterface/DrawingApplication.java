package learning.spring.codingToInterface;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		Shape myAdvTriangle = (Shape)applicationContext.getBean("advtriangle13");
		myAdvTriangle.draw();
		
		Shape myAdvCircle = (Shape)applicationContext.getBean("advtriangle14");
		myAdvCircle.draw();
	}
}
