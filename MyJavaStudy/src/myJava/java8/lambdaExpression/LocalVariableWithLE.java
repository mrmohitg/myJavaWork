package myJava.java8.lambdaExpression;

interface Interf5 {
	public void m1();
}

public class LocalVariableWithLE {

	int x = 10;

	public void m2() {
		int y = 20;
		Interf5 i = () -> {
			System.out.println(x);
			System.out.println(y);
			
			x = x + 1;
			//y = y + 1;
			
			System.out.println(x);
			System.out.println(y);
			
		};
		i.m1();

	}

	public static void main(String[] args) {
		LocalVariableWithLE obj = new LocalVariableWithLE();
		obj.m2();
	}

}
