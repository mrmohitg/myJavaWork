package learning.spring.codingToInterface;

public class AdvanceCircle implements Shape{
	
	private Point pointA;
	
	public Point getPointA() {
		return pointA;
	}

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
