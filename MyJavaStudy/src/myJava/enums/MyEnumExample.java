package myJava.enums;

enum myCars {
	BMW, AUDI, FERRARI, CAMERO
};

public class MyEnumExample {
	public static void main(String... args) {
		myCars currentCar = myCars.AUDI;
		System.out.println("My current cars : " + currentCar);
	}
}