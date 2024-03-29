package myJava.exceptionHandling;

//Creating a custome exception and depending upon the user's condition
class Salary extends Exception {
	String s;

	public String toString() {
		return s;
	}

	Salary(String s) {
		this.s = s;
		// super(s);
	}

	static void salary() throws Exception {
		int salary[] = { 2000, 3000, 4000, 5000, -900, 9000, 10000 };
		for (int i = 0; i < salary.length; i++) {
			if (salary[i] < 1) {
				throw new Salary("Wrong Salary");
			} else {
				System.out.println(salary[i]);
			}
		}
	}
}

class CustomeExceptions {
	public static void main(String... s) {
		try {
			Salary.salary();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\10CustomeException>java
 * CustomeExceptions 2000 3000 4000 5000 Wrong Salary
 */