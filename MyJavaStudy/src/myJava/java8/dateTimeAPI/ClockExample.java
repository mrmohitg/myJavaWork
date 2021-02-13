package myJava.java8.dateTimeAPI;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ClockExample {

	public static void main(String[] args) {
		Clock clock = Clock.systemDefaultZone();

		Instant instant1 = clock.instant();
		System.out.println(instant1);

		Instant instant2 = Instant.now(clock);
		System.out.println(instant2);

		LocalDate localDate = LocalDate.now(clock);
		System.out.println(localDate);

		ZonedDateTime zoneDateTime = ZonedDateTime.now(clock);
		System.out.println(zoneDateTime);

		Period p1 = Period.of(2, 3, 5); // 2 years, 3 months, and 5 days
		Period p2 = Period.ofDays(2); // 2 days
		Period p3 = Period.ofMonths(-3); // -3 months
		Period p4 = Period.ofWeeks(3); // 3 weeks
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

		Period p11 = Period.ofDays(15);
		System.out.println(p11);
		Period p12 = p1.plusDays(12);
		System.out.println(p12);
		Period p13 = p1.minusDays(12);
		System.out.println(p13);
		Period p14 = p1.negated();
		System.out.println(p14);
		Period p15 = p1.multipliedBy(3);
		System.out.println(p15);

		Period p21 = Period.of(2, 3, 5);
		Period p22 = Period.of(1, 15, 28);
		System.out.println(p21);
		System.out.println(p22);
		System.out.println(p21.minus(p22));
		System.out.println(p21.plus(p22));
		System.out.println(p21.plus(p22).normalized());

		LocalDate ld1 = LocalDate.of(2014, Month.JANUARY, 7);
		LocalDate ld2 = LocalDate.of(2014, Month.MAY, 21);
		long days = ChronoUnit.DAYS.between(ld1, ld2);
		System.out.println(days);

		LocalTime lt1 = LocalTime.of(6, 0);
		LocalTime lt2 = LocalTime.of(9, 30);
		long hours = ChronoUnit.HOURS.between(lt1, lt2);
		System.out.println(hours);
		long minutes = ChronoUnit.MINUTES.between(lt1, lt2);
		System.out.println(minutes);

		LocalDate ld11 = LocalDate.of(2014, Month.JANUARY, 7);
		LocalDate ld12 = LocalDate.of(2014, Month.MAY, 18);

		LocalTime lt11 = LocalTime.of(7, 0);
		LocalTime lt12 = LocalTime.of(9, 30);

		long days1 = ld11.until(ld12, ChronoUnit.DAYS);
		System.out.println(days1);
		long hours1 = lt11.until(lt12, ChronoUnit.HOURS);
		System.out.println(hours1);
		long minutes1 = lt11.until(lt12, ChronoUnit.MINUTES);
		System.out.println(minutes1);
	}

}
