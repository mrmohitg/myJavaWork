package myJava.nestedClasses.annonymousClass;

//Anonymous class uses interface and it is written by creating object of the interface which is used to define the child class whose object is being created.
class Annonymous {
	static int x = 20;

	my display() {
		return (new my() // here my() is interface and new make object hide class .annonymous class
		{ // must have child class but its not show and
			public void show()// prove is his .class files like annonymous$inner like this
			{
				System.out.println(x);
			}
		});
	}

	public static void main(String... s) {
		Annonymous v = new Annonymous();
		my z = v.display();
		z.show();
	}
}

interface my {
	void show();
}
/*
 * Output 20
 */