package myJava.constructor;

//Parametrized Constructor and calling non static method.
class ParameterizedConstructor {
	ParameterizedConstructor(int x) {
		System.out.println("This is ParametrizedConstructor " + x);
	}

	void Tem(int y) {
		System.out.println("This is Non static Method " + y);
	}

	public static void main(String... s) {
		new ParameterizedConstructor(70).Tem(90);
	}
}
/*
 * Output This is ParametrizedConstructor 70 This is Non static Method 90
 */