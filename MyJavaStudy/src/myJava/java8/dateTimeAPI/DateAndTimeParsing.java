package myJava.java8.dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;

public class DateAndTimeParsing {

	public static void main(String[] args) {

		LocalDate ld1 = LocalDate.parse("2014-06-10");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate ld2 = LocalDate.parse("06/10/2014", formatter);

		System.out.println("ld1: " + ld1);
		System.out.println("ld2: " + ld2);

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		TemporalAccessor ta = formatter1.parse("06/10/2014");
		LocalDate ld = LocalDate.from(ta);
		System.out.println(ld);

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate ld3 = formatter2.parse("06/10/2014", LocalDate::from);
		System.out.println(ld3);

		DateTimeFormatter parser = DateTimeFormatter.ofPattern("yyyy-MM- dd['T'HH:mm:ss[Z]]");
		parseStr(parser, "2014-06-31");
		parseStr(parser, "2014-06-31T15:31:12");
		parseStr(parser, "2014-06-31T15:31:12-0500");
		parseStr(parser, "2014-06-31Hello");
	}

	public static void parseStr(DateTimeFormatter formatter, String text) {
		try {
			TemporalAccessor ta = formatter.parseBest(text, OffsetDateTime::from, LocalDateTime::from, LocalDate::from);
			if (ta instanceof OffsetDateTime) {
				OffsetDateTime odt = OffsetDateTime.from(ta);
				System.out.println("OffsetDateTime: " + odt);
			} else if (ta instanceof LocalDateTime) {
				LocalDateTime ldt = LocalDateTime.from(ta);
				System.out.println("LocalDateTime: " + ldt);
			} else if (ta instanceof LocalDate) {
				LocalDate ld = LocalDate.from(ta);
				System.out.println("LocalDate: " + ld);
			} else {
				System.out.println("Parsing returned: " + ta);
			}
		} catch (DateTimeParseException e) {
			System.out.println(e.getMessage());
		}
	}
}
