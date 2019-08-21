package learning.spring.beanScopes;

public class AdvanceTriangle {
	
	private Point pointP;
	
	public Point getPointP() {
		return pointP;
	}

	public void setPointP(Point pointP) {
		this.pointP = pointP;
	}

	public void draw()
	{
		System.out.println("Point P = ("+getPointP().getX()+", "+getPointP().getY()+")");
		
	}

}
