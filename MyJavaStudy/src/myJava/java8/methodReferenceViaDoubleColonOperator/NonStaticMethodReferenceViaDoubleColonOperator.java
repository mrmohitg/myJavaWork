package myJava.java8.methodReferenceViaDoubleColonOperator;

interface Interf1 {
	public void m1();
}

public class NonStaticMethodReferenceViaDoubleColonOperator {

	public void m2() {
		System.out.println("This is Static Method Reference via Double Colon Operator");
	}

	public static void main(String... args) {
		NonStaticMethodReferenceViaDoubleColonOperator obj = new NonStaticMethodReferenceViaDoubleColonOperator();
		Interf i = obj::m2;
		i.m1();
	}
}
