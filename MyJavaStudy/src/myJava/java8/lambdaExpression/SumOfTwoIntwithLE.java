package myJava.java8.lambdaExpression;

interface Interf1 {
	public void m1(int i, int j);
}

public class SumOfTwoIntwithLE {

	public static void main(String[] args) {
		Interf1 i = (int a, int b) -> {
			System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
		};
		i.m1(10, 20);
	}

}
