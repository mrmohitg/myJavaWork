package myJava.java8.defaultMethod;

interface Interf1
{
	public default void m1()
	{
		System.out.println("This is default method");
	}
}

public class OverrideDefaultMethodInInterface implements Interf1{

	public void m1()
	{
		System.out.println("This is implementation of default method");
	}
	public static void main(String[] args) {
		Interf1 i = new OverrideDefaultMethodInInterface();
		i.m1();
	}

}
