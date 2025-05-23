package myJava.finalKeyword;

//If we use final keyword with method then it can not be override.
class Samplee {
	/*final*/ void display() {
		System.out.println("Mohit");
	}
}

public class FinalKeywordWithMethod extends Samplee {
	void display() {
		System.out.println("Anurag");
	}

	public static void main(String args[]) {
		FinalKeywordWithMethod obj = new FinalKeywordWithMethod();
		obj.display();
	}
}
/*
 * Output FinalKeywordWithMethod.java:11: error: display() in
 * FinalKeywordWithMethod cannot override display() in Sample void display() ^
 * overridden method is final 1 error
 */