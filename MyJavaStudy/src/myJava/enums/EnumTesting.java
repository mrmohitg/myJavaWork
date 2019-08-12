package myJava.enums;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumTesting {
	Day day;

	public EnumTesting(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	public static void main(String[] args) {
		EnumTesting firstday = new EnumTesting(Day.MONDAY);
		firstday.tellItLikeItIs();
		EnumTesting secondday = new EnumTesting(Day.FRIDAY);
		secondday.tellItLikeItIs();
		EnumTesting thirdday = new EnumTesting(Day.THURSDAY);
		thirdday.tellItLikeItIs();
		EnumTesting fourthday = new EnumTesting(Day.SUNDAY);
		fourthday.tellItLikeItIs();
	}

}
