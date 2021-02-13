package myJava.java8.dateTimeAPI;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ChronoFieldChronoUnitExample {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.get(ChronoField.YEAR));
		System.out.println(now.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(now.get(ChronoField.DAY_OF_MONTH));
		System.out.println(now.get(ChronoField.HOUR_OF_DAY));
		System.out.println(now.get(ChronoField.HOUR_OF_AMPM));
		System.out.println(now.get(ChronoField.AMPM_OF_DAY));

		LocalDateTime now1 = LocalDateTime.now();
		System.out.println(now1.isSupported(ChronoField.YEAR));
		System.out.println(now1.isSupported(ChronoField.HOUR_OF_DAY));

		System.out.println(ChronoField.YEAR.isSupportedBy(now1));
		System.out.println(ChronoField.HOUR_OF_DAY.isSupportedBy(now1));
		
		LocalDateTime now3 = LocalDateTime.now();

	    // Get the date time 10 days ago
	    LocalDateTime localDateTime1 = now3.minus(10, ChronoUnit.DAYS);
	    System.out.println(localDateTime1);
	}

}
