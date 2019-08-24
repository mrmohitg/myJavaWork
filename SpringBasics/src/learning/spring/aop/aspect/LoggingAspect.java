package learning.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	
	@Before("allMethods() && allCircleMethods()")
	public void loggingAdvice2(JoinPoint joinPoint)
	{
		System.out.println("All "+ joinPoint.toString()+" Circle Wild card After Annotaion");
		System.out.println(joinPoint.getTarget());
	}
	
	@Before("allCircleMethods()")
	public void loggingAdvice3()
	{
		System.out.println("All Model Classes ");
	}
	
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters() {}
	
	@Pointcut("within(learning.spring.aop.model.Circle)")
	public void allCircleMethods() {}
	
	@Pointcut("execution(public * *(..))")
	public void allMethods() {}
			
	@Before("args(name)")
	public void stringArgumentMethods(String name) 
	{
		System.out.println("A method that takes strings has been called "+ name);
	}
	
	@After("args(name)")
	public void stringArgumentMethods1(String name) 
	{
		System.out.println("A method that takes strings has been called "+ name+ " after the method has run.");
	} 
	
	@AfterReturning("args(name)")
	public void stringArgumentMethods2(String name) 
	{
		System.out.println("A method that takes strings has been called "+ name+ " after the method has run with after returning. ");
	} 
	
	@AfterReturning(pointcut="args(name)", returning="stringReturn")
	public void stringArgumentMethods3(String name, String stringReturn) 
	{
		System.out.println("A method that takes strings has been called "+ name+ " after the method has run with after returning. "+ stringReturn);
	}
	
	@AfterThrowing("args(name)")
	public void exceptionAdvice(String name)
	{
		System.out.println("An exception has been thrown.");
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exceptionAdvice1(String name, RuntimeException ex)
	{
		System.out.println("An exception has been thrown." + ex);
	}
	
}
