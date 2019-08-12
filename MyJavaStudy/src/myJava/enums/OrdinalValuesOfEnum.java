package myJava.enums;

enum lastweek {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
};

public class OrdinalValuesOfEnum {
	public static void main(String... args) {
		System.out.println("Here are all week constant " + " and their ordinal value :");
		lastweek day[] = lastweek.values();
		for (int i = 0; i < day.length; i++)
			System.out.println(day[i] + " = " + day[i].ordinal());
		for (lastweek days : lastweek.values())
			System.out.println(days + " = " + days.ordinal());
	}
}