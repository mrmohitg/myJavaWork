package myJava.concepts;

//Overloading will not work due to type promotion of the arguments.
class OverloadingWithArgumentType {
	void OverloadingWithArgumentType(int a, long b) {
		System.out.println("Int " + a + " Long " + b);
	}

	void OverloadingWithArgumentType(long a, int b) {
		System.out.println("Long " + a + " Int " + b);
	}

	public static void main(String args[]) {
		/*OverloadingWithArgumentType obj1 = new OverloadingWithArgumentType(10, 20L);
		OverloadingWithArgumentType obj2 = new OverloadingWithArgumentType(5L, 5);*/
	}
}
/*
 * Output OverloadingWithArgumentType.java:14: error: constructor
 * OverloadingWithArgumentType in class OverloadingWithArgumentType cannot be
 * applied to given types; OverloadingWithArgumentType obj1=new
 * OverloadingWithArgumentType(10,20L); ^ required: no arguments found: int,long
 * reason: actual and formal argument lists differ in length
 * OverloadingWithArgumentType.java:15: error: constructor
 * OverloadingWithArgumentType in class OverloadingWithArgumentType cannot be
 * applied to given types; OverloadingWithArgumentType obj2=new
 * OverloadingWithArgumentType(5L,5); ^ required: no arguments found: long,int
 * reason: actual and formal argument lists differ in length 2 errors
 */