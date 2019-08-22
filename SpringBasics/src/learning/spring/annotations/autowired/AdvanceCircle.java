package learning.spring.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AdvanceCircle implements Shape{
	
	private Point pointA;
	
	public Point getPointA() {
		return pointA;
	}

	@Autowired
	@Qualifier("circleRelated")
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing a Circle");
		System.out.println("Point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
		
	}

}
