package myJava.abstraction;

public class BirdTesting extends Bird {
	@Override
	public void fly() {
		System.out.println("Bird can fly");
	}

	public static void main(String[] args) {
		Bird obj = new BirdTesting();
		obj.fly();
		obj.eat();
		obj.see();
	}
}
