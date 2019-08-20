package learning.spring.autowiring.byNameConcept;

public class AdvanceTriangle {
	
	private Point pointX;
	
	private Point pointY;
	
	private Point pointZ;
	
	public Point getPointX() {
		return pointX;
	}

	public void setPointX(Point pointX) {
		this.pointX = pointX;
	}

	public Point getPointY() {
		return pointY;
	}

	public void setPointY(Point pointY) {
		this.pointY = pointY;
	}

	public Point getPointZ() {
		return pointZ;
	}

	public void setPointZ(Point pointZ) {
		this.pointZ = pointZ;
	}

	public void draw()
	{
		System.out.println("Point X = ("+getPointX().getX()+", "+getPointX().getY()+")");
		System.out.println("Point Y = ("+getPointY().getX()+", "+getPointY().getY()+")");
		System.out.println("Point Z = ("+getPointZ().getX()+", "+getPointZ().getY()+")");
		
	}

}
