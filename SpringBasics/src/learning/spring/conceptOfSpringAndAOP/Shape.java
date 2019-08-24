package learning.spring.conceptOfSpringAndAOP;

public class Shape {

	private Circle circle;
	
	private Triangle triangle;

	public Circle getCircle() {
		System.out.println("Getter of Circle is called.");
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	
	
	
	
}
