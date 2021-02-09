package myJava.java8.defaultMethod;

interface Left
{
	public default void m1()
	{
		System.out.println("This is Left");
	}
}

interface Right
{
	public default void m1()
	{
		System.out.println("This is Right");
	}
}

public class DefaultMethodInMultipleInheritance implements Left,Right{

	public void m1()
	{
		System.out.println("My own implementation of Left");
		Left.super.m1();
		Right.super.m1();
	}
	public static void main(String[] args) {
		DefaultMethodInMultipleInheritance i = new DefaultMethodInMultipleInheritance();
		i.m1();
	}

}
