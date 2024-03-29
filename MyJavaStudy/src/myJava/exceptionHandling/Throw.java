package myJava.exceptionHandling;

//This program shows how to create a custome exception or user defined exception.
class Throw {
	int age;

	void get(int age) {
		if (age < 18) {
			try {
				throw new ArithmeticException("You can't cast your vote. Your age is " + age + " i.e. less then 18.");
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
		} else {
			this.age = age;
			System.out.println("You can cast your vote as your age is " + this.age + " i.e. greater then 18.");
		}
	}

	public static void main(String... ssd) {
		try {
			Throw obj = new Throw();
			int x;
			System.out.println("Enter the age of the Student.");
			x = System.in.read();
			obj.get(x);
		} catch (Exception e) {
			System.out.println("Panga Ye Hai " + e);
		}
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\8Throw>java Throw Enter the age
 * of the Student. 10 java.lang.ArithmeticException: Invalid Age
 */