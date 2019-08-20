package learning.spring;

public class AdvanceCircle {
	
	private Point pointP;
	
	private Point pointQ;
	
	private Point pointR;
	
	public Point getPointP() {
		return pointP;
	}

	public void setPointP(Point pointP) {
		this.pointP = pointP;
	}

	public Point getPointQ() {
		return pointQ;
	}

	public void setPointQ(Point pointQ) {
		this.pointQ = pointQ;
	}

	public Point getPointR() {
		return pointR;
	}

	public void setPointR(Point pointR) {
		this.pointR = pointR;
	}

	public void draw()
	{
		System.out.println("Point P = ("+getPointP().getX()+", "+getPointP().getY()+")");
		System.out.println("Point Q = ("+getPointQ().getX()+", "+getPointQ().getY()+")");
		System.out.println("Point R = ("+getPointR().getX()+", "+getPointR().getY()+")");
		
	}

}
