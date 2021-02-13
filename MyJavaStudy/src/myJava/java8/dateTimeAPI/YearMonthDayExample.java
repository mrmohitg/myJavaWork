package myJava.java8.dateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class YearMonthDayExample {

	public static void main(String[] args) {
		Year y1 = Year.of(2014);
		System.out.println(y1);
		Year y2 = y1.minusYears(1);
		System.out.println(y2);
		Year y3 = y1.plusYears(1);
		System.out.println(y3);
		Year y4 = Year.now();
		System.out.println(y4);
		if (y1.isLeap()) {
			System.out.println(y1 + "  is a  leap year.");
		} else {
			System.out.println(y1 + "  is not  a  leap year.");
		}

		YearMonth ym1 = YearMonth.of(2014, Month.JUNE);

		int monthLen = ym1.lengthOfMonth();
		System.out.println(monthLen);

		int yearLen = ym1.lengthOfYear();
		System.out.println(yearLen);

		LocalDate localDate = LocalDate.of(2014, Month.AUGUST, 3);
		System.out.println(localDate);
		Month month1 = Month.from(localDate);
		System.out.println(month1);

		Month month2 = Month.of(2);
		System.out.println(month2);

		Month month3 = month2.plus(2);
		System.out.println(month3);

		Month month4 = localDate.getMonth();
		System.out.println(month4);

		int monthIntValue = month2.getValue();
		System.out.println(monthIntValue);

		MonthDay md1 = MonthDay.of(Month.DECEMBER, 25);
		MonthDay md2 = MonthDay.of(Month.FEBRUARY, 29);

		if (md2.isValidYear(2014)) {
			System.out.println(md2);
		}
		System.out.println(md1.getDayOfMonth());

		LocalDate localDate1 = LocalDate.of(2014, 6, 21);
		System.out.println(localDate1);
		DayOfWeek dayOfWeek1 = DayOfWeek.from(localDate1);
		System.out.println(dayOfWeek1);
		int intValue = dayOfWeek1.getValue();
		System.out.println(intValue);
		DayOfWeek dayOfWeek2 = localDate1.getDayOfWeek();
		System.out.println(dayOfWeek2);
		DayOfWeek dayOfWeekFromInteger = DayOfWeek.of(7);
		System.out.println(dayOfWeekFromInteger);
		DayOfWeek dayOfWeekAdded = dayOfWeekFromInteger.plus(1);
		System.out.println(dayOfWeekAdded);
		DayOfWeek dayOfWeekSubtracted = dayOfWeekFromInteger.minus(2);
		System.out.println(dayOfWeekSubtracted);
	}
}