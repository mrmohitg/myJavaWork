package myJava.java8.dateTimeAPI.instantsDurations;

import java.time.Instant;

public class InstantsExample {
	public static void main(String[] args) {
		Instant instantNow = Instant.now();
		System.out.println(instantNow);

		Instant instance9 = Instant.ofEpochSecond(9);
		System.out.println(instance9);

		instance9 = Instant.ofEpochSecond(-9);
		System.out.println(instance9);

		Instant i1 = Instant.now();
		long seconds = i1.getEpochSecond();
		System.out.println(seconds);
		int nanoSeconds = i1.getNano();
		System.out.println(nanoSeconds);
	}
}