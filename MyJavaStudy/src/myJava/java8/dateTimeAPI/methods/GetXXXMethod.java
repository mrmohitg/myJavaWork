package myJava.java8.dateTimeAPI.methods;

import java.time.LocalDate;
import java.time.Month;

public class GetXXXMethod {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2014, 6, 21);
		int year = localDate.getYear();
		System.out.println(year);
		Month month = localDate.getMonth();
		System.out.println(month);
		int day = localDate.getDayOfMonth();
		System.out.println(day);

	}
}