package myJava.java8.functionalInterface.consumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {

		BiConsumer<String,String> bic = (S1, S2) -> System.out.println(S1+" "+S2);
		bic.accept("Mohit", "Gupta");
	}

}
