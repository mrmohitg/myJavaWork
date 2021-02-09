package myJava.java8.defaultMethod;

interface Interf
{
	public default void m1()
	{
		System.out.println("This is default method");
	}
}

public class DefaultMethodInInterface implements Interf{

	public static void main(String[] args) {
		Interf i = new DefaultMethodInInterface();
		i.m1();
	}

}
