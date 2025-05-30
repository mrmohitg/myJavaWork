package myJava.concepts;

//Calling InstanceMemberFunction with different arguments
class InstanceMemberFunction {
	public void getA1() {
		System.out.println("First");
	}

	public void getA1(int s) {
		System.out.println(s++);
		System.out.println(s);
		System.out.println("Second");
	}

	public void getA1(int i1, int i2) {
		System.out.println(i1 + i2);
		System.out.println("Three");
	}

	public static void main(String arr[]) {
		InstanceMemberFunction obj = new InstanceMemberFunction();
		// getA1();
		// getA1(3);
		// getA1(4,6);
		obj.getA1();
		obj.getA1(3);
		obj.getA1(4, 6);
	}
}
/*
 * Output First 3 4 Second 10 Three
 */