package myJava.enums;
enum Apple {
	A(10), B(12), C(15), D(20);
	private int price;

	Apple(int p) {
		price = p;
	}

	int getPrice() {
		return price;
	}
}

public class ConstructorInEnum {
	public static void main(String... args) {
		System.out.println("D costs " + Apple.D.getPrice() + " cent.\n");
		System.out.println("All Apple Costs");
		for (Apple a : Apple.values())
			System.out.println(a + " cost " + a.getPrice());
	}
}