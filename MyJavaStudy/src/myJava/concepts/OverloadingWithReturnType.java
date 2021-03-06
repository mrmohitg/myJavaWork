package myJava.concepts;

//Overloading will not depend on the return type of the function
class OverloadingWithReturnType {
	int Display(int a, int b) {
		int c = a + b;
		System.out.println("The sum of the two number is : " + c);
		return 0;
	}

	/*long Display(int a, int b) {
		int c = a + b;
		System.out.println("The sum of the two number is : " + c);
		return 0;
	}*/

	public static void main(String... s) {
		OverloadingWithReturnType obj = new OverloadingWithReturnType();
		// int result = (int)obj.Display(10,10);
		obj.Display(10, 10);
	}
}
/*
 * Output OverloadingWithReturnType.java:10: error: method Display(int,int) is
 * already defined in class OverloadingWithReturnType long Display(int a, int b)
 * ^ 1 error
 */