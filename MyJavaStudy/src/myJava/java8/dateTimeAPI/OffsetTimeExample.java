package myJava.java8.dateTimeAPI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class OffsetTimeExample {
	public static void main(String[] args) {
		// current offset time
		OffsetTime ot1 = OffsetTime.now();
		System.out.println("Current  offset  time: " + ot1);

		// a zone offset +01:30
		ZoneOffset offset = ZoneOffset.ofHoursMinutes(1, 30);

		OffsetTime offsetTime = OffsetTime.of(16, 40, 28, 0, offset);
		System.out.println(offsetTime);

		// Get the current offset datetime OffsetDateTime
		OffsetDateTime odt1 = OffsetDateTime.now();
		// Create an offset datetime
		OffsetDateTime odt2 = OffsetDateTime.of(2012, 5, 11, 18, 10, 30, 0, ZoneOffset.UTC);

		// Get the local date and time from the offset datetime
		LocalDate localDate = odt1.toLocalDate();
		LocalTime localTime = odt1.toLocalTime();
		System.out.println(localDate);
		System.out.println(localTime);

		Instant i1 = Instant.now();

		ZoneId usChicago = ZoneId.of("America/Chicago");
		OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(i1, usChicago);
		System.out.println(offsetDateTime);

	}

}
