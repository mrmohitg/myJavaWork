package myJava.java8.methodReferenceViaDoubleColonOperator;

public class MethodReferenceExample {

	public void m1()
	{
		for(int i=0;i<10;i++)
			System.out.println("Child Thread");
	}
	public static void main(String[] args) {

		MethodReferenceExample obj = new MethodReferenceExample();
		Runnable r = obj::m1;
		Thread t = new Thread(r);
		t.start();
		
	}

}
