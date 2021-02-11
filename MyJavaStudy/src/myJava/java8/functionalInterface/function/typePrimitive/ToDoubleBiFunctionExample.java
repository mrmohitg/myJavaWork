package myJava.java8.functionalInterface.function.typePrimitive;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionExample {

	public static void main(String[] args) {
		ToDoubleBiFunction<Integer, Long> i = (x, y) -> Math.sin(x) + Math.sin(y);

		System.out.println(i.applyAsDouble(Integer.MAX_VALUE, Long.MAX_VALUE));
	}
}