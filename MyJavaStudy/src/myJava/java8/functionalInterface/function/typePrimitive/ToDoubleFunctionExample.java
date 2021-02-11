package myJava.java8.functionalInterface.function.typePrimitive;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionExample {

	public static void main(String[] args) {
		ToDoubleFunction<Integer> i = (x) -> Math.sin(x);

		System.out.println(i.applyAsDouble(Integer.MAX_VALUE));
	}
}