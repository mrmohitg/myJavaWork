package myJava.inheritance.concepts.superKeyword;

//Accessing Parent Class DataMember of MultiLevel Inheritance
class Dada {
	int x = 100;
}

class Papa extends Dada {
	int x = 60;
}

class Beta extends Papa {
	int x = 30;

	void display() {
		int x = 10;
		System.out.println(x + " Local Variable x");
		System.out.println(this.x + " Beta Class Variable x");
		System.out.println(super.x + " Papa Class Level Variable x");
		System.out.println(((Dada) this).x + " Dada Class Level Variable x");
	}
}

class DataAccess {
	public static void main(String args[]) {
		Beta obj = new Beta();
		obj.display();
	}
}
/*
 * Output 10 Local Variable x 30 Beta Class Variable x 60 Papa Class Level
 * Variable x 100 Dada Class Level Variable x
 */