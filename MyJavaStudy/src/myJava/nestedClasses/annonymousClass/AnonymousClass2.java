package myJava.nestedClasses.annonymousClass;

//Anonymous Class in working state
class AnonymousClass2 {
	int x = 10;
	static int y = 20;

	Myyy display(Myyy myyy) {
		myyy.show();
		return myyy;
	}

	public static void main(String... s) {
		AnonymousClass2 obj = new AnonymousClass2();
		obj.display(new Myyy() {
			public void show() {
				System.out.println("Hello");
			}
		});
	}
}

interface Myyy {
	void show();
}
/*
 * Output Hello
 */