package myJava.nestedClasses.localClass;

//Non static method having local class which is having non static method in it 
class LocalClass {
	int x = 10;
	static int y = 20;

	void show() {
		class Inner {
			void display() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner i = new Inner();
		i.display();
	}

	public static void main(String agrs[]) {
		LocalClass obj = new LocalClass();
		obj.show();
	}
}
/*
 * Output 10 20
 */