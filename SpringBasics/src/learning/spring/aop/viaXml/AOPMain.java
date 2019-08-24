package learning.spring.aop.viaXml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.spring.aop.viaXml.service.ShapeService;

public class AOPMain {

	public static void main(String args[]) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring8.xml");

		applicationContext.registerShutdownHook();
		
		ShapeService shapeService = applicationContext.getBean("shapeService", ShapeService.class);
		
		shapeService.getCircle();
		
		shapeService.getTriangle();
		
	}

}
