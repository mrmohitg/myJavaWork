package myJava.java8.dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateTimeAPI {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());

		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getMonthValue());
		System.out.println(dt.getYear());
		System.out.println(dt.getHour());
		System.out.println(dt.getMinute());
		System.out.println(dt.getSecond());
		System.out.println(dt.getNano());

		LocalDateTime dt1 = LocalDateTime.of(1987, 11, 01, 8, 00);
		System.out.println(dt1);
		System.out.println(dt1.plusMonths(6));
		System.out.println(dt1.minusMonths(6));

		LocalDate birthday = LocalDate.of(1987, 11, 01);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.println(p.getYears() + " " + p.getMonths() + " " + p.getDays());

		LocalDate deathday = LocalDate.of(1987 + 60, 11, 01);
		Period p1 = Period.between(today, deathday);
		int daysLeftOnEarth = p1.getYears() * 365 + p1.getMonths() * 30 + p1.getDays();
		System.out.println(daysLeftOnEarth);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		Year y = Year.of(year);
		if (y.isLeap())
			System.out.println("Year is leap year");
		else
			System.out.println("Year is not leap year");

		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);

		ZoneId zone1 = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(zone1);
		System.out.println(zdt);

	}

}
