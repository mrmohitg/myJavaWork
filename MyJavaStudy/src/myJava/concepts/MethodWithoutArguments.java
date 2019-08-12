package myJava.concepts;

//Calling a method without arguments
class MethodWithoutArguments {
	private void show() {
		System.out.println("This is show method without arguments");
	}

	public static void main(String args[]) {
		MethodWithoutArguments obj = new MethodWithoutArguments();
		obj.show();
	}
}
/*
 * Output This is show method without arguments
 */