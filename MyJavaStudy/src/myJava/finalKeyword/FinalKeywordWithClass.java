package myJava.finalKeyword;

//If we use final keyword with class then it is not inheritable.
/*final*/ class Sample {
	public void disp() {
		System.out.println("Sample Class is a Final Class.");
	}
}

class FinalKeywordWithClass extends Sample {
	public void display() {
		System.out.println("Final Class");
	}

	public static void main(String args[]) {
		FinalKeywordWithClass obj = new FinalKeywordWithClass();
		Sample obj2 = new Sample();
		obj.display();
		obj2.disp();
	}
}
/*
 * Output FinalKeywordWithClass.java:9: error: cannot inherit from final Sample
 * class FinalKeywordWithClass extends Sample ^ 1 error
 */