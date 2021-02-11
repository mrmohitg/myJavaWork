package myJava.java8.functionalInterface.consumer.typePrimitive;

import java.util.function.IntConsumer;

public class IntConsumerExample {

	public static void main(String[] args) {
		IntConsumer ic = (x) -> System.out.println(x);

		ic.accept(3);

	}
}