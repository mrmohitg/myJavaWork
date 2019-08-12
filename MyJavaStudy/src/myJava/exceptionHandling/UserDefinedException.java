package myJava.exceptionHandling;

//User defined exception for banking application.
class UserDefinedException extends Exception {
	static int accountno[] = { 1001, 1002, 1003, 1004, 1005 };
	static String name[] = { "Mohit", "Anurag", "Anupriya", "Swati", "Arnav" };
	static double balance[] = { 50000.00, 400.00, 40000.00, 30000.00, 10000.00 };
	String str;

	public String toString() {
		return str;
	}

	UserDefinedException(String str) {
		this.str = str;
	}

	public static void main(String args[]) {
		try {
			System.out.println("Account" + "\t" + "Customer" + "\t" + "Balance");
			for (int i = 0; i < 5; i++) {
				if (balance[i] < 1000) {
					UserDefinedException obj = new UserDefinedException("Balance amount is less");
					throw obj;
				} else {
					System.out.println(accountno[i] + "\t" + name[i] + "\t" + balance[i]);
				}
			}
		} catch (UserDefinedException obj) {
			System.out.println(obj);
		}
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\10CustomeException>java
 * UserDefinedException Account Customer Balance 1001 Mohit 50000.0 Balance
 * amount is less
 */