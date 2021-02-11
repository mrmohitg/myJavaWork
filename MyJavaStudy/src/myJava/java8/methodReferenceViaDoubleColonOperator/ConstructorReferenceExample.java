package myJava.java8.methodReferenceViaDoubleColonOperator;

class Sample {

	public Sample() {
		super();
		System.out.println("Sample Constructor");
	}

}

interface Interf2 {
	public Sample get();
}

public class ConstructorReferenceExample {

	public static void main(String[] args) {

		Interf2 i = Sample::new;
		i.get();

	}

}
