package myJava.concepts;

//Static Member Function is used when we are not performing any task for particular instance. It can be called with three ways.
class StaticMemberFunction {
	static void getW1() {
		System.out.println("getW1 is active");
	}

	static void getW2() {
		System.out.println("getW2 is active");
	}

	static void getW3() {
		System.out.println("getW3 is active");
	}

	public static void main(String arr[]) {
		System.out.println("Direct");
		getW1();
		getW2();
		getW3();
		System.out.println("With the name of class");
		StaticMemberFunction.getW1();
		StaticMemberFunction.getW2();
		StaticMemberFunction.getW3();
		System.out.println("With the help of object.");
		StaticMemberFunction obj = new StaticMemberFunction();
		obj.getW1();
		obj.getW2();
		obj.getW3();
	}
}
/*
 * output Direct getW1 is active getW2 is active getW3 is active With the name
 * of class getW1 is active getW2 is active getW3 is active With the help of
 * object. getW1 is active getW2 is active getW3 is active
 */