package myJava.java8.lambdaExpression;

interface Interf4
{
	public void m1();
}
public class AnonymousClassWithLE {

	int x = 888;
	public void m2()
	{
		Interf4 i = () -> {
			int x = 999;
				System.out.println(this.x);
		};
		i.m1();
		System.out.println(AnonymousClassWithLE.this.x);
	}
	public static void main(String[] args) {
		AnonymousClassWithLE obj = new AnonymousClassWithLE();
		obj.m2();
	}

}
