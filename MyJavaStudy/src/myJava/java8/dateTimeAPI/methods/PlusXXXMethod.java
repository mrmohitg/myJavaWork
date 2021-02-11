package myJava.java8.dateTimeAPI.methods;

import java.time.LocalDate;

public class PlusXXXMethod {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2014, 6, 21);
		LocalDate localDate1 = localDate.plusDays(5);
		System.out.println(localDate1);
		LocalDate localDate2 = localDate.plusMonths(3);
		System.out.println(localDate2);
		LocalDate localDate3 = localDate.plusWeeks(3);
		System.out.println(localDate3);
	}
}