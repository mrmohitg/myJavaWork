package myJava.java8.lambdaExpression;

interface Interf3
{
	public void m1();
}
public class AnonymousClassWithoutLE {

	int x = 888;
	public void m2()
	{
		Interf3 i = new Interf3() {
			int x = 999;
			public void m1()
			{
				System.out.println(this.x);
			}
		};
		i.m1();
		System.out.println(AnonymousClassWithoutLE.this.x);
	}
	public static void main(String[] args) {
		AnonymousClassWithoutLE obj = new AnonymousClassWithoutLE();
		obj.m2();
	}

}
