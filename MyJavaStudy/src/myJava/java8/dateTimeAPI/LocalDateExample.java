package myJava.java8.dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateExample {
	public static void main(String[] args) {
		// Get the current local date
		LocalDate localDate1 = LocalDate.now();
		System.out.println(localDate1);
		// Create a local date
		LocalDate localDate2 = LocalDate.of(2014, Month.JUNE, 21);
		System.out.println(localDate2);
		// 10000 days after the epoch date 1970-01-01
		LocalDate localDate3 = LocalDate.ofEpochDay(10000);
		System.out.println(localDate3);

		MonthDay dec25 = MonthDay.of(Month.DECEMBER, 25);
		Year year = Year.now();

		for (int i = 1; i <= 5; i++) {
			LocalDate ld = year.plusYears(i).atMonthDay(dec25);
			int yr = ld.getYear();
			String weekDay = ld.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
			System.out.format("Christmas in  %d  is on  %s.%n", yr, weekDay);
		}

		LocalTime localTime1 = LocalTime.now();
		System.out.println(localTime1);
		// 09:30
		LocalTime localTime2 = LocalTime.of(9, 30);
		System.out.println(localTime2);
		// 09:30:50
		LocalTime localTime3 = LocalTime.of(9, 30, 50);
		System.out.println(localTime3);
		// 09:30:50.000005678
		LocalTime localTime4 = LocalTime.of(9, 30, 50, 5678);
		System.out.println(localTime4);

		// current
		LocalDateTime localDateTime1 = LocalDateTime.now();
		System.out.println(localDateTime1);

		// 2014-06-21T16:12:34
		LocalDateTime localDateTime2 = LocalDateTime.of(2014, Month.JUNE, 21, 16, 12, 34);
		System.out.println(localDateTime2);
		// from a local date and a local time
		LocalDate localDate4 = LocalDate.of(2014, 5, 10);
		LocalTime localTime = LocalTime.of(16, 18, 41);
		LocalDateTime localDateTime3 = LocalDateTime.of(localDate4, localTime);
		System.out.println(localDateTime3);
	}
}