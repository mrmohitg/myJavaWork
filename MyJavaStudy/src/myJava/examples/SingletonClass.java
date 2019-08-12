package myJava.examples;

class Demo
{
	private static Demo d = null;
	
	private String s = null;

	private Demo()
	{
		
	}
	public static Demo getInstance()
	{
		if(d == null)
			d = new Demo();
		return d;
	}
	public String show()
	{
		s = "This is Singleton Pattern in action";
		return s;
	}
}



public class SingletonClass {

	public static void main(String[] args) {
		Demo d = Demo.getInstance();
		System.out.println(d);
		System.out.println(d.show());
		
	}

}
