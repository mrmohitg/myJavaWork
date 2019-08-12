package myJava.inheritance.concepts;

//Constructor execution rule in java is that evertime we create a object then parent class constructor has to call.
class Papa {
	Papa() {
		System.out.println("Papa");
	}
}

class Beta extends Papa {
	Beta() {
		System.out.println("Beta");
	}
}

class ConstructorInInheritance extends Beta {
	ConstructorInInheritance() {
		System.out.println("Constructor In Inheritance: Constructor are never inherited.");
	}

	ConstructorInInheritance(int x) {
		System.out.println(x);
	}

	public static void main(String... s) {
		new ConstructorInInheritance();
		new ConstructorInInheritance(10);
	}
}
/*
 * Output Papa Beta Constructor In Inheritance: Constructor are never inherited.
 * Papa Beta 10
 */