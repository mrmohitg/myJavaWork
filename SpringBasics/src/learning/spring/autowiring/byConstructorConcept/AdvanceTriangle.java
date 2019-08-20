package learning.spring.autowiring.byConstructorConcept;

public class AdvanceTriangle {
	
	private Point pointT;

	public Point getPointT() {
		return pointT;
	}

	/*public void setPointT(Point pointT) {
		this.pointT = pointT;
	}*/

	public AdvanceTriangle(Point pointT) {
		super();
		this.pointT = pointT;
	}
	
	public void draw()
	{
		System.out.println("Point X = ("+getPointT().getX()+", "+getPointT().getY()+")");
	}

}
