package myJava.finalKeyword;

//If we use final keyword with variable then we can not change its value. 
class FinalKeywordWithVariable {
	/*final*/ int x;

	void initialize(int x) {
		this.x = x;
		System.out.println(x);
	}

	public static void main(String... s) {
		FinalKeywordWithVariable obj = new FinalKeywordWithVariable();
		obj.initialize(10);
	}
}
/*
 * Output FinalKeywordWithVariable.java:7: error: cannot assign a value to final
 * variable x this.x =x; ^ 1 error
 */