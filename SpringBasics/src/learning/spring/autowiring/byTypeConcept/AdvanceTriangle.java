package learning.spring.autowiring.byTypeConcept;

public class AdvanceTriangle {
	
	private Point pointX;
	
	public Point getPointX() {
		return pointX;
	}

	public void setPointX(Point pointX) {
		this.pointX = pointX;
	}

	public void draw()
	{
		System.out.println("Point X = ("+getPointX().getX()+", "+getPointX().getY()+")");
	}

}
