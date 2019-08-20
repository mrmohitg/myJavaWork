package learning.spring;

public class Circle {
	
	private String type;
	
	private int height;
	
	
	
	public int getHeight() {
		return height;
	}



	/*public void setHeight(int height) {
		this.height = height;
	}*/



	public String getType() {
		return type;
	}



	/*public void setType(String type) {
		this.type = type;
	}*/



	public Circle(String type) {
		super();
		this.type = type;
	}

	public Circle(int height) {
		super();
		this.height = height;
	}

	public Circle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}



	public void draw()
	{
		System.out.println("Draw "+ type +" Circle"+ " it's height is "+getHeight());
	}

}
