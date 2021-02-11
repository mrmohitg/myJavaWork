package myJava.java8.dateTimeAPI.methods;

import java.time.LocalDate;
import java.time.Month;

public class WithMethod {
	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.of(2014, Month.MAY, 2);
		System.out.println(localDate1);

		LocalDate localDate2 = localDate1.withYear(2015);
		System.out.println(localDate2);

		LocalDate localDate3 = localDate1.withYear(2014).withMonth(7);
		System.out.println(localDate3);

	}
}