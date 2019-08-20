package learning.spring;

public class Rectangle {
	
	private String type;
	
	private int height;

	public String getType() {
		return type;
	}

	/*public void setType(String type) {
		this.type = type;
	}*/

	public int getHeight() {
		return height;
	}

	/*public void setHeight(int height) {
		this.height = height;
	}*/

	public Rectangle(int height) {
		super();
		this.height = height;
	}

	public Rectangle(String type) {
		super();
		this.type = type;
	}

	public Rectangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}
	
	public void draw()
	{
		System.out.println("Draw "+ type +" Rectangle"+ " it's height is "+getHeight());
	}

}
