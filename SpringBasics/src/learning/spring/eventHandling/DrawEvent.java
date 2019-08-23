package learning.spring.eventHandling;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent{

	public DrawEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "This is my Event";
	}

	
}
