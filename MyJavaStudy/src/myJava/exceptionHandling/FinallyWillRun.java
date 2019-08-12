package myJava.exceptionHandling;

//If function returns a value and finally block is also returning a value then whose value is going to print.
class FinallyWillRun {
	static int show() {
		try {
			int x = 1000 / 10;
			return x;
		} finally {
			return 40;
		}
	}

	public static void main(String[] hbkjh) {
		int y = FinallyWillRun.show();
		System.out.println(y);
	}
}
/*
 * Output 40
 */