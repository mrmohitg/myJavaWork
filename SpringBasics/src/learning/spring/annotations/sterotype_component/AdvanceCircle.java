package learning.spring.annotations.sterotype_component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class AdvanceCircle implements Shape{
	
	private Point pointA;
	
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
		System.out.println("Drawing a Circle");
		System.out.println("Point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
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
