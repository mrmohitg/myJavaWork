package myJava.concepts;

//Function returning a value is not mandatory to catch.
class FunctionReturnIsNotNecessaryCatch {
	public int getF(int i) {
		System.out.println("FunctionReturnIsNotNecessaryCatch is active");
		System.out.println("The value of i is " + i);
		return i;
	}

	public static void main(String arr[]) {
		FunctionReturnIsNotNecessaryCatch obj = new FunctionReturnIsNotNecessaryCatch();
		obj.getF(1000);
	}
}
/*
 * Output FunctionReturnIsNotNecessaryCatch is active The value of i is 1000
 */