package learning.spring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("execution(public String learning.spring.aop.model.Circle.getName())")
	public void loggingAdvice()
	{
		System.out.println("Advice Run and Get method is called.");
	}
	
	
	@Before("execution(public * get*(..))")
	public void loggingAdvice1()
	{
		System.out.println("All getter Wild card");
	}
	
	@After("allGetters()")
	public void loggingAdvice2()
	{
		System.out.println("All getter Wild card");
	}
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters() {}
	
			
}
