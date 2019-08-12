package myJava.nestedClasses.annonymousClass;

//Anonymous Class is at work and we are using non static method in this anonymous class
class AnonymousClass {
	int x = 10;
	static int y = 20;

	Myy display() {
		return (new Myy() {
			public void show() {
				System.out.println(x);
				System.out.println(y);
			}
		});
	}

	public static void main(String... s) {
		AnonymousClass obj = new AnonymousClass();
		Myy o = obj.display();
		o.show();
	}
}

interface Myy {
	void show();
}

/*
 * Output 10 20
 */