package learning.spring.inheritance.abstraction;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AdvanceTriangle{
	
	private List<Point> pointss;
	
	public List<Point> getPointss() {
		return pointss;
	}

	public void setPointss(List<Point> pointss) {
		this.pointss = pointss;
	}

	public void draw()
	{
		for (Point points : pointss) {
			System.out.println("Point A = ("+points.getX()+", "+points.getY()+")");
		}
	}
}
