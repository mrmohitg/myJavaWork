package myJava.inheritance;

//Single Inheritance at work
class Name {
	int i = 10;

	public void disp() {
		System.out.println("Anurag");
	}
}

public class SingleInheritance extends Name {
	public void display() {
		System.out.println("Mohit");
		System.out.println(super.i);
		System.out.println(this.i);
	}

	public static void main(String args[]) {
		SingleInheritance s = new SingleInheritance();
		s.display();
		s.disp();
	}
}
/*
 * output Mohit 10 10 Anurag
 */