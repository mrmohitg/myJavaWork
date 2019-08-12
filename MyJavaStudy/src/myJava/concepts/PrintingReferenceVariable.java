package myJava.concepts;

//Printing Reference Variable gives Combination of 'PrintingReferenceVariable@asd982376jh7'
class PrintingReferenceVariable {
	int x;

	PrintingReferenceVariable(int y) {
		x = y;
		System.out.println(x);
	}

	public static void main(String arr[]) {
		PrintingReferenceVariable q1 = new PrintingReferenceVariable(100);
		System.out.println(q1);
		PrintingReferenceVariable q2 = new PrintingReferenceVariable(200);
		System.out.println(q2);
		PrintingReferenceVariable q3 = new PrintingReferenceVariable(300);
		System.out.println(q3);
		PrintingReferenceVariable q4 = new PrintingReferenceVariable(400);
		System.out.println(q4);
	}
}
/*
 * Output 100 PrintingReferenceVariable@2a139a55 200
 * PrintingReferenceVariable@15db9742 300 PrintingReferenceVariable@6d06d69c 400
 * PrintingReferenceVariable@7852e922
 */