package myJava.java8.dateTimeAPI.instantsDurations;

import java.time.Duration;
import java.time.Instant;

public class DurationsExample {
	public static void main(String[] args) {

		Duration d1 = Duration.ofDays(2);
		System.out.println(d1);

		Duration d2 = Duration.ofMinutes(2);
		System.out.println(d2);

		Duration d3 = Duration.ofSeconds(200); // 3 minutes and 20 seconds
		Duration d4 = d3.multipliedBy(2); // 6 minutes and 40 seconds
		Duration d5 = d3.negated(); // -3 minutes and -20 seconds
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);

		Duration d6 = Duration.ofSeconds(55);
		Duration d7 = Duration.ofSeconds(-17);

		Instant i1 = Instant.now();

		Instant i4 = i1.plus(d6);
		Instant i5 = i1.minus(d7);

		Duration d8 = d6.plus(d7);
		System.out.println(d8);
	}
}