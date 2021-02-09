package myJava.java8.staticMethod;

interface Interf2
{
	public static void m1()
	{
		System.out.println("This is a Interface Static method");
	}
}

public class InterfaceStaticMethodOverriding2 implements Interf2{

	//This is not method overriding
	public void m1()
	{
		System.out.println("This is method overriding in interface.");
	}
	public static void main(String[] args) {
		InterfaceStaticMethodOverriding2 i = new InterfaceStaticMethodOverriding2();
		i.m1();
		
	}

}
