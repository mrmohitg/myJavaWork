package learning.spring.aop.service;

import learning.spring.aop.aspect.Loggable;
import learning.spring.aop.model.Circle;
import learning.spring.aop.model.Triangle;

public class ShapeService {
	
	private Circle circle;
	
	private Triangle triangle;

	@Loggable
	public Circle getCircle() {
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
