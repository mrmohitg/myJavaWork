package learning.spring.eventHandling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListner implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		System.out.println(arg0.toString());
	}

}
