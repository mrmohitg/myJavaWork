package myJava.java8.dateTimeAPI.methods;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FromMethod {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.of(2015, 6, 21, 13, 40);
		System.out.println(localDateTime);

		LocalDate localDate = LocalDate.from(localDateTime);
		System.out.println(localDate);
	}
}