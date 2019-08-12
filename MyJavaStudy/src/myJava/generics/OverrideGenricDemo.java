package myJava.generics;

class Gen1<T> {
	T ob; // Declare an object of type T
	// Pass the Constructor a reference to an object of type T

	Gen1(T o) {
		ob = o;
	}

	// Return ob
	T getob() {
		System.out.println("Gen1's getob(): ");
		return ob;
	}
}

// A subclass of Gen that overrides getob()
class Gen2<T> extends Gen<T> {
	Gen2(T o) {
		super(o);
	}

	// Overrides getob()
	T getob() {
		System.out.println("Gen2's getob(): ");
		return ob;
	}
}

// Demonstrate genric method override.
public class OverrideGenricDemo {
	public static void main(String... args) {
		// Create a Gen object for Integer
		Gen1<Integer> iob = new Gen1<Integer>(88);
		Gen2<Integer> iob2 = new Gen2<Integer>(99);
		Gen2<String> strob2 = new Gen2<String>("Genric Override");
		System.out.println(iob.getob());
		System.out.println(iob2.getob());
		System.out.println(strob2.getob());
	}
}