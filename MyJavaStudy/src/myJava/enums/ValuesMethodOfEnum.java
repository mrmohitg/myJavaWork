package myJava.enums;

enum week {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
};

public class ValuesMethodOfEnum {
	public static void main(String... args) {
		System.out.println("Here are all the week days.");
		week allWeek[] = week.values();
		System.out.println("Via For each loop.");
		for (week aDay : allWeek) {
			System.out.println(aDay);
		}
		System.out.println("Via For loop.");
		for (int i = 0; i < allWeek.length; i++)
			System.out.println(allWeek[i]);
	}
}