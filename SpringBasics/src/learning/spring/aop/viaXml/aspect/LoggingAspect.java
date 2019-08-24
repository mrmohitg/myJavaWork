package learning.spring.aop.viaXml.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	public void myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
	{
		System.out.println("Hi Mohit");
		try {
			proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bye Mohit");
	}

	
}
