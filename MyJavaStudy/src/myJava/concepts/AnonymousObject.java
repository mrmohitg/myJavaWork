package myJava.concepts;

//Anonymous object is used to call the instance method only once so we can't recall the same instance again. 
class AnonymousObject {
	String name;
	int salary;

	void setget(String s1, int i) {
		name = s1;
		salary = i;
		System.out.println("The name is " + name);
		System.out.println("The salary is " + salary);
	}

	public static void main(String... s) {
		new AnonymousObject().setget("Mohit", 2000);
	}
}
/*
 * Output The name is Mohit The salary is 2000
 */