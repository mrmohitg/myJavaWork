package learning.spring.conceptOfSpringAndAOP;

public class ShapeProxy extends Shape{
	
	@Override
	public Circle getCircle() {
		LoggingAspect loggingAspect = new LoggingAspect();
		loggingAspect.advice();
		return super.getCircle();
	}

}
