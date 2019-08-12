package myJava.enums;

enum thisweek {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
};

public class ValueOfMethodOFEnum {
	public static void main(String... args) {
		thisweek day;
		day = thisweek.valueOf("Monday");
		System.out.println(day);
		day = thisweek.valueOf("Tuesday");
		System.out.println(day);
		day = thisweek.valueOf("Wednesday");
		System.out.println(day);
		day = thisweek.valueOf("Thursday");
		System.out.println(day);
		day = thisweek.valueOf("Friday");
		System.out.println(day);
		day = thisweek.valueOf("Saturday");
		System.out.println(day);
		day = thisweek.valueOf("Sunday");
		System.out.println(day);
	}
}