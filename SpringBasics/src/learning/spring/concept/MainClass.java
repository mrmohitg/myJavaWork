package learning.spring.concept;

public class MainClass {
	
	public static void main(String[] args) {
		FactoryShape factoryShape = new FactoryShape();
		Shape obj = (Shape)factoryShape.getBean("shape");
		obj.getCircle();
		
	}

}
