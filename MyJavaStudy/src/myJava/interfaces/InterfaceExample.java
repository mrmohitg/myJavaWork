package myJava.interfaces;

//Interface example in action
interface Bird {
	int x = 200;

	public abstract void fly();

	public abstract void nonFly();
}

class InterfaceExample implements Bird {
	public void fly() {
		System.out.println("This Bird Can Fly.");
	}

	public void nonFly() {
		System.out.println("This Bird Can't Fly");
	}

	public static void main(String args[]) {
		Bird m = new InterfaceExample();
		m.fly();
		m.nonFly();
		System.out.println(m.x);
		InterfaceExample obj = new InterfaceExample();
		obj.fly();
		obj.nonFly();
		System.out.println(obj.x);
	}
}
/*
 * Output This Bird Can Fly. This Bird Can't Fly 200 This Bird Can Fly. This
 * Bird Can't Fly 200
 */