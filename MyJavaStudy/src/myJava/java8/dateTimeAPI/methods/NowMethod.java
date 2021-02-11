package myJava.java8.dateTimeAPI.methods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class NowMethod {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		ZonedDateTime dateTimeWithZone = ZonedDateTime.now();
		System.out.println(dateTimeWithZone);
	}
}