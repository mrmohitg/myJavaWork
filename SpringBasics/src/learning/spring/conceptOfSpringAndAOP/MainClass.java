package learning.spring.conceptOfSpringAndAOP;

public class MainClass {
	
	public static void main(String[] args) {
		FactoryShape factoryShape = new FactoryShape();
		Shape obj = (Shape)factoryShape.getBean("shape");
		obj.getCircle();
		
	}

}
