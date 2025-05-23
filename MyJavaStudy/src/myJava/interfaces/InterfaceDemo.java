package myJava.interfaces;

//Providing body to the abstract method of interface and calling it via child class object because interface can't be instantiated. 
interface My {
	int i = 10;

	void show();
}

interface My1 {
	void display();
}

class InterfaceDemo implements My, My1 {
	public void show() {
		System.out.println("Its show method of  My interface.");
	}

	public void display() {
		System.out.println("Its display method of My1 interface.");
	}

	public static void main(String... s) {
		My obj1 = new InterfaceDemo();
		obj1.show();
		My1 obj2 = new InterfaceDemo();
		obj2.display();
	}
}
/*
 * Output Its show method of My interface. Its display method of My1 interface.
 */