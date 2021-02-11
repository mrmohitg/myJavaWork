package myJava.java8.methodReferenceViaDoubleColonOperator;

interface Interf {
	public void m1();
}

public class StaticMethodReferenceViaDoubleColonOperator {

	public static void m2() {
		System.out.println("This is Static Method Reference via Double Colon Operator");
	}

	public static void main(String... args) {
		Interf i = StaticMethodReferenceViaDoubleColonOperator::m2;
		i.m1();
	}
}
