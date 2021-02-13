package myJava.java8.dateTimeAPI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTimeLegacyInteroperability {
	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println("Date: " + dt);

		Instant in = dt.toInstant();
		System.out.println("Instant: " + in);

		Date dt2 = Date.from(in);
		System.out.println("Date: " + dt2);
		
		GregorianCalendar gc = new GregorianCalendar(2014, 1, 11, 15, 45, 50);
	    LocalDate ld = gc.toZonedDateTime().toLocalDate();
	    System.out.println("Local  Date: " + ld);
	 
	    LocalTime lt = gc.toZonedDateTime().toLocalTime();
	    System.out.println("Local Time:  " + lt);
	    
	    LocalDateTime ldt = gc.toZonedDateTime().toLocalDateTime();
	    System.out.println("Local DateTime:  " + ldt);

	    OffsetDateTime od = gc.toZonedDateTime().toOffsetDateTime();
	    System.out.println("Offset  Date: " + od);

	    OffsetTime ot = gc.toZonedDateTime().toOffsetDateTime().toOffsetTime();
	    System.out.println("Offset Time:  " + ot);

	    ZonedDateTime zdt = gc.toZonedDateTime();
	    System.out.println("Zoned DateTime:  " + zdt);

	    ZoneId zoneId = zdt.getZone();
	    TimeZone timeZone = TimeZone.getTimeZone(zoneId);
	    System.out.println("Zone ID:  " + zoneId);
	    System.out.println("Time Zone ID:  " + timeZone.getID());

	    GregorianCalendar gc2 = GregorianCalendar.from(zdt);
	    System.out.println("Gregorian  Calendar: " + gc2.getTime());
	}
}