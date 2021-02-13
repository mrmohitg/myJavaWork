package myJava.java8.dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.util.Locale;

public class DateTimeFormatterExample {
	public static void main(String[] argv) {
		String ldStr = DateTimeFormatter.ISO_DATE.format(LocalDate.now());
		System.out.println(ldStr);
		String odtStr = DateTimeFormatter.ISO_DATE.format(OffsetDateTime.now());
		System.out.println(odtStr);
		String zdtStr = DateTimeFormatter.ISO_DATE.format(ZonedDateTime.now());
		System.out.println(zdtStr);

		LocalDate ld = LocalDate.now();
		String ldStr1 = ld.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Local  Date: " + ldStr1);

		OffsetDateTime odt = OffsetDateTime.now();
		String odtStr1 = odt.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Offset  Datetime: " + odtStr1);

		ZonedDateTime zdt = ZonedDateTime.now();
		String zdtStr1 = zdt.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Zoned  Datetime: " + zdtStr1);

		LocalDate ld1 = LocalDate.of(2014, Month.JUNE, 30);
		format(ld1, "M/d/yyyy");
		format(ld1, "MM/dd/yyyy");
		format(ld1, "MMM   dd,   yyyy");
		format(ld1, "MMMM   dd,   yyyy");
		format(ld1, "EEEE, MMMM   dd,   yyyy");
		format(ld1, "'Month' q  'in' QQQ");

		LocalTime lt = LocalTime.of(16, 30, 5, 78899);
		format(lt, "HH:mm:ss");
		format(lt, "KK:mm:ss a");
		format(lt, "[MM-dd-yyyy][' at' HH:mm:ss]");

		ZoneId usCentral = ZoneId.of("America/Chicago");
		ZonedDateTime zdt1 = ZonedDateTime.of(LocalDate.now(), lt, usCentral);
		format(zdt1, "MM/dd/yyyy HH:mm:ssXXX");
		format(zdt1, "MM/dd/yyyy VV");
		format(zdt1, "[MM-dd-yyyy][' at' HH:mm:ss]");

		String pattern = "MM/dd/yyyy[ 'at' HH:mm:ss]";
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);

		LocalDate ld11 = LocalDate.of(2014, Month.JUNE, 30);
		LocalTime lt1 = LocalTime.of(17, 30, 12);
		LocalDateTime ldt = LocalDateTime.of(ld11, lt1);

		String str1 = fmt.format(ld);
		System.out.println(str1);

		String str2 = fmt.format(ldt);

		System.out.println(str2);

		DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendLiteral("New Year in ")
				.appendValue(ChronoField.YEAR).appendLiteral(" is  on  ")
				.appendText(ChronoField.DAY_OF_WEEK, TextStyle.FULL_STANDALONE).toFormatter();
		LocalDate ld12 = LocalDate.of(2014, Month.JANUARY, 1);
		String str = ld12.format(formatter);
		System.out.println(str);

		LocalDate ld13 = LocalDate.of(2014, Month.JANUARY, 1);
		String pattern1 = "'New Year in'  yyyy  'is on' EEEE";
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(pattern1);
		String str11 = ld.format(formatter1);
		System.out.println(str11);

	}

	public static void format(Temporal co, String pattern) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
		String str = fmt.format(co);
		System.out.println(pattern + ": " + str);
	}

	public static void format1(Temporal co, String pattern) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern, Locale.US);
		String str = fmt.format(co);
		System.out.println(pattern + ": " + str);
	}
}