package myJava.java8.dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalSpecificFormatExample {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2014, Month.JUNE, 21);
		LocalTime lt = LocalTime.of(17, 30, 20);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);

		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("Formatter  Default Locale: " + fmt.getLocale());
		System.out.println("Short  Date: " + fmt.format(ld));

		fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println("Medium Date: " + fmt.format(ld));

		fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println("Long  Date: " + fmt.format(ld));

		fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("Full  Date: " + fmt.format(ld));

		fmt = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println("Short Time:  " + fmt.format(lt));

		fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println("Short  Datetime: " + fmt.format(ldt));

		fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println("Medium Datetime: " + fmt.format(ldt));

		// Use German locale to format the datetime in medius style
		fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
		System.out.println(fmt.format(ldt));

		// Use Indian(English) locale to format datetime in short style
		fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("en", "IN"));
		System.out.println(fmt.format(ldt));

		// Use Indian(English) locale to format datetime in medium style
		fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(new Locale("en", "IN"));
		System.out.println(fmt.format(ldt));

	}
}