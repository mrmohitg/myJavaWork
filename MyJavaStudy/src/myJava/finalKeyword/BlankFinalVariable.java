package myJava.finalKeyword;

//Blank Final variable is concept to initialize the final class level variable with a user defined value that will later be unchangable.
class BlankFinalVariable {
	final int x;

	BlankFinalVariable(int x) {
		this.x = x;
		System.out.println("Local Variable " + x);
		System.out.println("Class Variable " + this.x);
	}

	public static void main(String... s) {
		BlankFinalVariable obj = new BlankFinalVariable(10);
		new BlankFinalVariable(100);
	}
}
/*
 * Output Local Variable 10 Class Variable 10 Local Variable 100 Class Variable
 * 100
 */