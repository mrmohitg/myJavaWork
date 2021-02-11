package myJava.java8.dateTimeAPI.methods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

public class AtXXXMethod {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2014, 6, 21);
		System.out.println(localDate);

		LocalDateTime localTime1 = localDate.atStartOfDay();
		System.out.println(localTime1);

		LocalDateTime localTime2 = localDate.atTime(16, 21);
		System.out.println(localTime2);
		
		LocalDate localDate1  = Year.of(2014).atMonth(6).atDay(21);
	    System.out.println(localDate1);
	}
}