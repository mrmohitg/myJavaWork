package myJava.java8.dateTimeAPI;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyDateCalendarExample {

	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println("Current date: " + currentDate);

		long millis = currentDate.getTime();
		System.out.println("Current  datetime  in millis: " + millis);

		// Get the current date in the system default time zone
		GregorianCalendar currentDate1 = new GregorianCalendar();
		System.out.println(currentDate1.getTime());
		// Get GregorianCalendar object representing March 21, 2014 07:30:45 AM
		GregorianCalendar someDate = new GregorianCalendar(2014, Calendar.MARCH, 21, 7, 30, 45);
		System.out.println(someDate.getTime());
		// Get Indian time zone, which is GMT+05:30
		TimeZone indianTZ = TimeZone.getTimeZone("GMT+05:30");
		GregorianCalendar indianDate = new GregorianCalendar(indianTZ);
		System.out.println(indianDate.getTime());

		GregorianCalendar gc = new GregorianCalendar();
		// current year value
		int year = gc.get(Calendar.YEAR);
		System.out.println(year);
		// current month value
		int month = gc.get(Calendar.MONTH);
		System.out.println(month);
		// day of month
		int day = gc.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		// hour value
		int hour = gc.get(Calendar.HOUR);
		System.out.println(hour);
		// minute value
		int minute = gc.get(Calendar.MINUTE);
		System.out.println(minute);
		// second values
		int second = gc.get(Calendar.SECOND);
		System.out.println(second);

		GregorianCalendar gc1 = new GregorianCalendar(2014, Calendar.DECEMBER, 1);
		gc1.add(Calendar.MONTH, 5);
		System.out.println(gc1.getTime());

		GregorianCalendar gc2 = new GregorianCalendar();
		System.out.println("Current  Date: " + gc2.getTime());
		// Add 1 year
		gc2.add(Calendar.YEAR, 1);
		System.out.println(gc2.getTime());

		// Add 15 days
		gc2.add(Calendar.DATE, 15);
		System.out.println(gc2.getTime());

	}

}