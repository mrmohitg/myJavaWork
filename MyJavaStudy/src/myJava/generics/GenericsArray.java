package myJava.generics;

class Genn<T extends Number> {
	T ob;
	T vals[];

	Genn(T o, T[] num) {
		ob = o;
		vals = num;
	}
}

public class GenericsArray {
	public static void main(String... args) {
		Integer n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Genn<Integer> iob = new Genn<Integer>(50, n);
		// Can't create an array of type-specific generic references.
		// Gen<Integer> gens[] = new Gen<Integer>[10];
		// Wrong!
		Genn<?> gens[] = new Genn<?>[10];
		gens[0] = new Genn<Integer>(10, n);
		gens[1] = new Genn<Float>(2.3f, new Float[] { 1.2f });
		for (int i = 0; i < gens[0].vals.length; i++)
			System.out.println(gens[0].vals[i]);
	}
}