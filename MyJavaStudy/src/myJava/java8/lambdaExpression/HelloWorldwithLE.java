package myJava.java8.lambdaExpression;

interface Interf
{
	public void m1();
}

public class HelloWorldwithLE {

	public static void main(String[] args) {

		Interf i = () -> {System.out.println("Hello World via Lambda Expression");};
		i.m1();
		
	}

}
