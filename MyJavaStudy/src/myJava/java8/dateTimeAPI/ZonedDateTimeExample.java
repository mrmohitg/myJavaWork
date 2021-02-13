package myJava.java8.dateTimeAPI;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
	public static void main(String[] args) {
		ZoneId usCentral = ZoneId.of("America/Chicago");
		LocalDateTime localDateTime = LocalDateTime.of(2014, Month.MAY, 21, 9, 30);
		System.out.println(localDateTime);
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, usCentral);
		System.out.println(zonedDateTime);

		ZoneId usChicago = ZoneId.of("America/Chicago");

		// 2014-03-09T02:30 did not exist in America/Chicago time zone
		LocalDateTime ldt = LocalDateTime.of(2014, Month.MARCH, 9, 2, 30);
		ZonedDateTime zdt = ZonedDateTime.of(ldt, usChicago);
		System.out.println(zdt);

		// 2013-10-03T01:30 existed twice in America/Chicago time zone
		LocalDateTime ldt2 = LocalDateTime.of(2013, Month.NOVEMBER, 3, 1, 30);
		ZonedDateTime zdt2 = ZonedDateTime.of(ldt2, usChicago);

		System.out.println(zdt2.withEarlierOffsetAtOverlap());
		System.out.println(zdt2.withLaterOffsetAtOverlap());

		ZoneId usChicago1 = ZoneId.of("America/Chicago");
		ZoneOffset offset5 = ZoneOffset.of("-05:00");
		ZoneOffset offset6 = ZoneOffset.of("-06:00");
		ZoneOffset offset7 = ZoneOffset.of("-07:00");

		LocalDateTime ldt1 = LocalDateTime.of(2012, Month.NOVEMBER, 4, 1, 30);
		ZonedDateTime zdt5 = ZonedDateTime.ofLocal(ldt1, usChicago1, offset5);
		ZonedDateTime zdt6 = ZonedDateTime.ofLocal(ldt1, usChicago1, offset6);
		ZonedDateTime zdt7 = ZonedDateTime.ofLocal(ldt1, usChicago1, offset7);

		System.out.println("With offset  " + offset5 + ": " + zdt5);
		System.out.println("With offset  " + offset6 + ": " + zdt6);
		System.out.println("With offset  " + offset7 + ": " + zdt7);

		ZonedDateTime zdt1 = ZonedDateTime.now();
		System.out.println("Current zoned  datetime:" + zdt1);

		LocalDateTime ldt3 = LocalDateTime.of(2012, Month.MARCH, 11, 7, 30);

		ZoneId usCentralZone = ZoneId.of("America/Chicago");
		ZonedDateTime zdt3 = ZonedDateTime.of(ldt3, usCentralZone);
		System.out.println(zdt3);

		ZoneId usCentral1 = ZoneId.of("America/Chicago");
		LocalDateTime ldt4 = LocalDateTime.of(2012, Month.MARCH, 10, 7, 30);
		ZonedDateTime zdt4 = ZonedDateTime.of(ldt4, usCentral1);

		Duration d1 = Duration.ofHours(24);

		ZonedDateTime zdt8 = zdt4.plus(d1);
		System.out.println(zdt8);

		ZoneId usCentral2 = ZoneId.of("America/Chicago");
		LocalDateTime ldt5 = LocalDateTime.of(2012, Month.MARCH, 10, 7, 30);
		ZonedDateTime zdt9 = ZonedDateTime.of(ldt5, usCentral2);
		Period p1 = Period.ofDays(1);

		ZonedDateTime zdt10 = zdt9.plus(p1);
		System.out.println(zdt10);
	}

}
