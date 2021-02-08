package myJava.java8.functionalInterface;

public class SqaureOfNumberTest {

	public static void main(String[] args) {
		SquareOfNumber i = x -> x * x;
		System.out.println("The square is " + i.sqaureIt(10));

	}

}
