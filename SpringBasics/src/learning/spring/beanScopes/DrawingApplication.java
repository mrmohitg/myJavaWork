package learning.spring.beanScopes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		AdvanceTriangle myAdvTriangle = (AdvanceTriangle)applicationContext.getBean("advtriangle5");
		myAdvTriangle.draw();
		
		AdvanceTriangle myAdvTriangle1 = (AdvanceTriangle)applicationContext.getBean("advtriangle5");
		
		if(myAdvTriangle1.equals(myAdvTriangle))
			System.out.println("This is Singleton Scope.");
		else
			System.out.println("This is not Singleton Scope.");
		
		
		AdvanceTriangle myAdvTriangle2 = (AdvanceTriangle)applicationContext.getBean("advtriangle6");
		myAdvTriangle.draw();
		
		AdvanceTriangle myAdvTriangle3 = (AdvanceTriangle)applicationContext.getBean("advtriangle6");
		
		if(myAdvTriangle2.equals(myAdvTriangle3))
			System.out.println("This is Singleton Scope.");
		else
			System.out.println("This is Prototype Scope.");
		
		
		
	}

}
