package myJava.java8.staticMethod;

interface Interf3
{
	public static void m1()
	{
		System.out.println("This is a Interface Static method");
	}
}

public class InterfaceStaticMethodOverriding3 implements Interf2{

	//This is not method overriding
	private void m1()
	{
		System.out.println("This is method overriding in interface.");
	}
	public static void main(String[] args) {
		InterfaceStaticMethodOverriding3 i = new InterfaceStaticMethodOverriding3();
		i.m1();
		
	}

}
