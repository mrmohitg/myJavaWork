package myJava.java8.staticMethod;

interface Interf
{
	public static void m1()
	{
		System.out.println("This is a Interface Static method");
	}
}

public class StaticMethodInInterface implements Interf{

	public static void main(String[] args) {
		Interf i = new StaticMethodInInterface();
		//i.m1();
		//m1();
		//StaticMethodInInterface.m1();
		Interf.m1();
		
	}

}
