package myJava.exceptionHandling;

//This program is showing how we can stop finally block from executing.
class FinallyBlockNotExecuting {
	static int show() {
		try {
			int x = 100 / 0;
			return x;
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Only Catch is executing but not Finally block.");
			System.exit(0);
		} finally {
			System.out.println("These will not execute due to previous statement.");
			return (40);
		}
	}

	public static void main(String[] hbkjh) {
		int y = FinallyBlockNotExecuting.show();
		System.out.println(y);
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\5TryCatchFinallyBlock>java
 * FinallyBlockNotExecuting java.lang.ArithmeticException: / by zero Only Catch
 * is executing but not Finally block.
 */