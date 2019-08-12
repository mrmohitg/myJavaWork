package myJava.enums;

enum theirsweek {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
};

class EqualsMethodOfEnum {
	public static void main(String... args) {
		theirsweek day1, day2, day3;
		day1 = theirsweek.Sunday;
		day2 = theirsweek.Sunday;
		day3 = theirsweek.Monday;
		System.out.println("day1 is " + day1 + " day2 is " + day2 + " day3 is " + day3);
		if (day1.equals(day2))
			System.out.println(day1 + " is equals to " + day2);
		if (day2.equals(day3))
			System.out.println(day2 + " is equals to " + day3);
		if (day3.equals(day1))
			System.out.println(day3 + " is equals to " + day1);
	}
}