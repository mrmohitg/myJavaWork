package learning.spring.annotations.required;

import org.springframework.beans.factory.annotation.Required;

public class AdvanceCircle implements Shape{
	
	private Point pointA;
	
	public Point getPointA() {
		return pointA;
	}

	@Required
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
