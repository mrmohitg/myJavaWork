package learning.spring.messageFromProperties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class AdvanceCircle implements Shape{
	
	private Point pointA;
	
	@Autowired
	private MessageSource messageSource;
	
	public Point getPointA() {
		return pointA;
	}

	@Resource
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	@Override
	public void draw()
	{
		System.out.println(messageSource.getMessage("drawing.circle", null, "Default Circle Message", null));
		System.out.println(messageSource.getMessage("drawing.points", new Object[] {pointA.getX(), pointA.getY()}, "Default Point Message", null));
		System.out.println(messageSource.getMessage("greeting1", null, "Default Circle Message", null));
	}
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@PostConstruct
	public void initializeCircle()
	{
		System.out.println("Init of Circle is called.");
	}
	
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("Destroy of Circle is called.");
	}

}
