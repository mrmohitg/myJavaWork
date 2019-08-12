package springintro.spring_foundations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
	
	@Bean
	public String greetings()
	{
		return "World";
	}
	
	public static void main(String[] args) {
		ApplicationContext appContext = new  AnnotationConfigApplicationContext(HelloConfig.class);
		String s = (String)appContext.getBean("greetings");
		System.out.println("Hello "+s);
	}

}
