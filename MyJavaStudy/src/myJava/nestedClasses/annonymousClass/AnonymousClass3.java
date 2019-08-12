package myJava.nestedClasses.annonymousClass;

//Anonymous Class is in action
class AnonymousClass3 {
	int x = 10;
	static int y = 20;

	Myyyy display(Myyyy M) {
		M.show();
		return M;
	}

	public static void main(String... s) {
		AnonymousClass3 o = new AnonymousClass3();
		Myyyy obj = new Myyyy() {
			public void show() {
				System.out.println("Hello");
			}
		};
		o.display(obj);
	}
}

interface Myyyy {
	void show();
}
/*
 * Output Hello
 */