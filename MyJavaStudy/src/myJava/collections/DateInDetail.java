package myJava.collections;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateInDetail {
	
	public static void main(String[] args) {
		Date today = new Date();
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(today);
		System.out.println(today);
		System.out.println("Today :"+today.toString());
		displayDateInfo(cal);
	}
	
	static void displayDateInfo(GregorianCalendar cal)
	{
		String days[] = {" ", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		String months[] = {"Jan", "Feb" , "Mar" , "Apr" , "May" , "Jun" , "Jul" , "Aug" , "Sep" , "Oct" , "Nov","Dec"};
		String am_pm[] = {"am", "pm"};
		System.out.println("Year : "+cal.get(Calendar.YEAR));
		System.out.println("Month : "+months[cal.get(Calendar.MONTH)]);
		System.out.println("Day : "+days[cal.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("Hours : "+cal.get(Calendar.HOUR));
		System.out.println("Minute : "+cal.get(Calendar.MINUTE));
		System.out.println("Seconds : "+cal.get(Calendar.SECOND));
		System.out.println("Seconds : "+am_pm[cal.get(Calendar.AM_PM)]);
		TimeZone timeZone = cal.getTimeZone();
		System.out.println(timeZone.getID());
 	}
}
