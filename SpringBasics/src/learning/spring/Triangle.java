package learning.spring;

public class Triangle {
	
	public String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw()
	{
		System.out.println("Draw "+ type +" Triangle");
	}
}
