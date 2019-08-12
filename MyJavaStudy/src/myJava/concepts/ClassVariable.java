package myJava.concepts;

//Class level variable
class ClassVariable {
	int x = 7;

	public void display() {
		x = x + 1;
		System.out.println(x);
	}

	void disp() {
		x = x + 1;
		System.out.println(x);
	}

	public static void main(String args[]) {
		ClassVariable obj = new ClassVariable();
		obj.display();
		obj.disp();
	}
}
/*
 * Output 8 9
 */