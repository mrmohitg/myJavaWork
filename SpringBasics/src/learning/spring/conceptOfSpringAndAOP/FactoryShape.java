package learning.spring.conceptOfSpringAndAOP;

public class FactoryShape {
	
	public Object getBean(String name)
	{
		if(name.equals("shape"))
			return new ShapeProxy();
		if(name.equals("circle"))
			return new Circle();
		if(name.equals("triangle"))
			return new Triangle();
		return null;
	}

}
