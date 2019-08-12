package myJava.interfaces;

//Interface working in action
interface VariableTest {
	int x = 10;
	int y = 20;

	void disp();
}

class VarIntTest implements VariableTest {
	public void disp() {
		System.out.println("\nInside interface VariableTest and method disp");
	}

	void display() {
		System.out.println("\nValue of x is: " + x);
	}
}

class Interfaces {
	public static void main(String args[]) {
		VarIntTest v = new VarIntTest();
		v.disp();
		v.display();
	}
}
/*
 * Output Value of x is: 10
 */