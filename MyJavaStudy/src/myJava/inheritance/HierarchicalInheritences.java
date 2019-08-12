package myJava.inheritance;

//HierarchicalInheritences at work
class Parent {
	public void Display() {
		System.out.println("This is display method of parent class.");
	}
}

class Child1 extends Parent {
	public void Display() {
		System.out.println("This is display method of child1 class.");
	}
}

class Child2 extends Parent {
	public void Display() {
		System.out.println("This is display method of child2 class.");
	}
}

class HierarchicalInheritences {
	public static void main(String args[]) {
		Child1 obj1 = new Child1();
		obj1.Display();
		Child2 obj2 = new Child2();
		obj2.Display();
		Parent obj3 = new Parent();
		obj3.Display();
	}
}
/*
 * Output This is display method of child1 class. This is display method of
 * child2 class. This is display method of parent class.
 */