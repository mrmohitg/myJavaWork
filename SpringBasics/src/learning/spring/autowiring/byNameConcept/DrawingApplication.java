package learning.spring.autowiring.byNameConcept;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		AdvanceTriangle myAdvTriangle = (AdvanceTriangle)applicationContext.getBean("advtriangle2");
		myAdvTriangle.draw();
		
		
		
	}

}
