package myJava.java8.dateTimeAPI.methods;

import java.time.LocalDate;
import java.time.Month;

public class OfMethod {
	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.of(2014, 5, 21);
		System.out.println(localDate1);

		LocalDate localDate2 = LocalDate.of(2014, Month.MARCH, 4);
		System.out.println(localDate2);

		LocalDate localDate3 = LocalDate.ofEpochDay(2014);
		System.out.println(localDate3);

		LocalDate localDate4 = LocalDate.ofYearDay(2014, 39);
		System.out.println(localDate4);
	}
}