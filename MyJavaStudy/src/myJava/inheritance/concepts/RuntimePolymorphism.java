package myJava.inheritance.concepts;

//RuntimePolymorphism at work
class Sita extends Object {
	public void eat() {
		System.out.println("Sita eats Rajma Chawal");
	}
}

class Gita extends Sita {
	public void eat() {
		System.out.println("Gita eats Chole Chawal");
	}
}

class RuntimePolymorphism {
	public static void main(String arr[]) {
		Sita g = new Sita();
		Sita g2 = new Gita();
		Gita g3 = new Gita();
		// Gita g4=new Sita();
		g.eat();
		g2.eat();
		g3.eat();
		// g4.eat();
	}
}
/*
 * Output Sita eats Rajma Chawal Gita eats Chole Chawal Gita eats Chole Chawal
 */