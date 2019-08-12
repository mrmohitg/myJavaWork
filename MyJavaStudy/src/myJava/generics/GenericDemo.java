package myJava.generics;

class Gen<T> {
	T ob;

	Gen(T o) {
		ob = o;
	}

	T getob() {
		return ob;
	}

	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

public class GenericDemo {
	public static void main(String... args) {
		// Gen<Integer> iob;
		Gen<Integer> iob = new Gen<Integer>(98);
		iob.showType();
		int v = iob.getob();
		System.out.println("Value = " + v);
		Gen<String> strob = new Gen<>("Generics Test");
		strob.showType();
		String str = strob.getob();
		System.out.println("Value :" + str);
		Emp e1 = new Emp();
		Gen<Emp> eob = new Gen<Emp>(e1);
		eob.showType();
		Emp e2 = eob.getob();
		System.out.println("Value : " + e2.x);
		// iob = strob;
	}
}

class Emp {
	int x = 10;
}