package myJava.java8.functionalInterface.consumer.typePrimitive;

import java.util.function.LongConsumer;

public class LongConsumerExample {

	public static void main(String[] args) {
		LongConsumer i = (l) -> System.out.println(l);
		i.accept(Long.MAX_VALUE);
	}
}