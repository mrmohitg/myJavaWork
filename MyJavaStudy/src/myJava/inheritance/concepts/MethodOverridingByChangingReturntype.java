package myJava.inheritance.concepts;

//This is the only way to do method overriding by changing return type of the method.
class MethodOverriding {
	MethodOverriding Name() {
		System.out.println("This is MethodOverriding Class.");
		return new MethodOverriding();
	}
}

class MethodOverridingByChangingReturntype extends MethodOverriding {
	MethodOverridingByChangingReturntype Name() {
		System.out.println("This is MethodOverridingByChangingReturntype Class.");
		return new MethodOverridingByChangingReturntype();
	}

	public static void main(String args[]) {
		MethodOverridingByChangingReturntype obj = new MethodOverridingByChangingReturntype();
		obj.Name();
		MethodOverriding obj1 = new MethodOverridingByChangingReturntype();
		obj1.Name();
		MethodOverriding obj2 = new MethodOverriding();
		obj2.Name();
	}
}
/*
 * Output This is MethodOverridingByChangingReturntype Class. This is
 * MethodOverridingByChangingReturntype Class. This is MethodOverriding Class.
 */