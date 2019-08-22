package learning.spring.annotations.required;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		Shape myAdvTriangle = (Shape)applicationContext.getBean("advtriangle15");
		myAdvTriangle.draw();
		
		/*Shape myAdvCircle = (Shape)applicationContext.getBean("advtriangle16");
		myAdvCircle.draw();*/
	}
}
