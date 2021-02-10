package myJava.java8.functionalInterface.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		
		Consumer<String> c = S -> System.out.println(S);
		c.accept("Mohit");
	}

}
