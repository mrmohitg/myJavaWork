package myJava.java8.functionalInterface.consumer.typePrimitive;

import java.util.function.DoubleConsumer;

public class DoubleConsumerExample {
	public static void main(String[] args) {
		DoubleConsumer d = (x) -> System.out.println(x * x);
		d.accept(0.23);
	}
}