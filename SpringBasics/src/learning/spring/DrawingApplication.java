package learning.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {

		/*Triangle triangle = new Triangle();
		triangle.draw();*/
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle myTriangle = (Triangle)beanFactory.getBean("triangle");
		myTriangle.draw();
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Circle myCircle = (Circle)applicationContext.getBean("circle");
		myCircle.draw();
		
		Circle myCircle1 = (Circle)applicationContext.getBean("circle1");
		myCircle1.draw();
		
		Rectangle rectangle = (Rectangle)applicationContext.getBean("rectangle");
		rectangle.draw();
		
		
		AdvanceTriangle myAdvTriangle = (AdvanceTriangle)applicationContext.getBean("advtriangle");
		myAdvTriangle.draw();
	}

}
