package myJava.constructor;

//Overriding for constructor in action 
class Overriding {
	public void Overriding() {
		System.out.println("Mohit");
	}
}

class ConstructorOverriding extends Overriding {
	public void Overriding() {
		System.out.println("Anurag");
	}

	public static void main(String args[]) {
		ConstructorOverriding obj = new ConstructorOverriding();
		obj.Overriding();
		Overriding obj2 = new ConstructorOverriding();
		obj2.Overriding();
		Overriding obj3 = new Overriding();
		obj3.Overriding();
		// ConstructorOverriding obj4 = new Overriding();
		// obj4.Overriding();
	}
}
/*
 * Output Anurag Anurag Mohit
 */