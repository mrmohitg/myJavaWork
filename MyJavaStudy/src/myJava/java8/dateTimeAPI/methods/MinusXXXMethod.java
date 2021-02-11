package myJava.java8.dateTimeAPI.methods;

import java.time.LocalDate;

public class MinusXXXMethod {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2014, 6, 21);
		LocalDate localDate1 = localDate.minusMonths(5);
		System.out.println(localDate1);
		LocalDate localDate2 = localDate.minusWeeks(3);
		System.out.println(localDate2);
	}
}