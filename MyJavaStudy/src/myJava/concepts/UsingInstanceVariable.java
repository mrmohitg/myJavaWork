package myJava.concepts;

//Incrementing one instance data member will not effect the other 
class Teest {
	int x = 10;

	void display() {
		System.out.println(x);
	}
}

public class UsingInstanceVariable {
	public static void main(String args[]) {
		Teest obj1, obj2;
		obj1 = new Teest();
		obj2 = new Teest();
		++obj1.x;
		System.out.println("x in obj1: ");
		obj1.display();
		System.out.println("x in obj2: ");
		obj2.display();
	}
}
/*
 * Output x in obj1: 11 x in obj2: 10
 */