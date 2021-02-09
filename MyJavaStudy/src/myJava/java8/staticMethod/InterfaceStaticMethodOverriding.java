package myJava.java8.staticMethod;

interface Interf1
{
	public static void m1()
	{
		System.out.println("This is a Interface Static method");
	}
}

public class InterfaceStaticMethodOverriding implements Interf1{

	public static void m1()
	{
		System.out.println("This is method overriding in interface.");
	}
	public static void main(String[] args) {
		InterfaceStaticMethodOverriding i = new InterfaceStaticMethodOverriding();
		i.m1();
		
	}

}
