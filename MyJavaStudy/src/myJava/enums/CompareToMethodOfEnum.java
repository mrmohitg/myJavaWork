package myJava.enums;
enum ourweek {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
};

public class CompareToMethodOfEnum {
	public static void main(String... args) {
		ourweek day1, day2, day3;
		day1 = ourweek.Monday;
		day2 = ourweek.Tuesday;
		day3 = ourweek.Wednesday;
		if (day1.compareTo(day2) < 0)
			System.out.println(day1 + " comes before " + day2);
		if (day2.compareTo(day3) > 0)
			System.out.println(day2 + " comes after " + day3);
		if (day3.compareTo(day1) == 0)
			System.out.println(day1 + " equals " + day3);
	}
}