package myJava.java8.dateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterExample {

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.of(2014, Month.JANUARY, 1);
		LocalDate ld2 = ld1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println(ld1);
		System.out.println(ld2);

		LocalDate ld11 = LocalDate.of(2014, Month.MAY, 21);
		System.out.println(ld11);
		LocalDate ld12 = ld1.with(TemporalAdjusters.dayOfWeekInMonth(5, DayOfWeek.SUNDAY));
		System.out.println(ld12);

		// Create an adjuster that retruns a date after 3 months and 2 days
		TemporalAdjuster adjuster = TemporalAdjusters
				.ofDateAdjuster((LocalDate date) -> date.plusMonths(3).plusDays(2));

		LocalDate today = LocalDate.now();
		LocalDate dayAfter3Mon2Day = today.with(adjuster);
		System.out.println("Today: " + today);
		System.out.println("After 3  months  and  2  days: " + dayAfter3Mon2Day);
	}

}
