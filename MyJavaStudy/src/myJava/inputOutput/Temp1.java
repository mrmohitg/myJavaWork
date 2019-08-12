package myJava.inputOutput;

/*Calling of function at class level*/
class Temp1 {
	int x = get();

	int get() {
		return 10;
	}

	public static void main(String a[]) {
		Temp1 t = new Temp1();
		System.err.println(t.x);
	}
}

/* Calling of static function at class level */
class Temp2 {
	static int x = get();

	static int get() {
		return 10;
	}

	public static void main(String a[]) {
		System.err.println(x);
	}
}