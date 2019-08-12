package myJava.nestedClasses.localClass;

//Method is returning it local class instance which is having implements one interface 
class LocalClass2 {
	int x = 10;
	static int y = 20;

	My show() {
		class Inner implements My {
			public void display() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		My m = new Inner();
		return m;
	}

	public static void main(String agrs[]) {
		LocalClass2 obj = new LocalClass2();
		obj.show();
		My obj2 = obj.show();
		obj2.display();
	}
}

interface My {
	void display();
}

/*
 * Output 10 20
 */