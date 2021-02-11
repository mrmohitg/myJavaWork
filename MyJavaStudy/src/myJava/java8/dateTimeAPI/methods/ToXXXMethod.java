package myJava.java8.dateTimeAPI.methods;

import java.time.LocalDate;

public class ToXXXMethod {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2014, 6, 21);
		long days = localDate.toEpochDay();
		System.out.println(days);

	}
}