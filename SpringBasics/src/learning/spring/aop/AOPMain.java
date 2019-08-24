package learning.spring.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.spring.aop.service.ShapeService;

public class AOPMain {

	public static void main(String args[]) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring7.xml");

		applicationContext.registerShutdownHook();
		
		ShapeService shapeService = applicationContext.getBean("shapeService", ShapeService.class);
		
		shapeService.getCircle().setName("Mohit Circle");
		
		shapeService.getCircle().setName1("Mohit Circle");

		System.out.println(shapeService.getCircle().getName());
		
		System.out.println(shapeService.getTriangle().getName());
		
		
		
	}

}
