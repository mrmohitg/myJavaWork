package myJava.abstraction;

abstract class Figure {
	double dim1;
	double dim2;

	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	abstract double area();
}

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b);
	}

	double area() {
		System.out.println();
		return dim1 * dim2;
	}
}

class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a, b);
	}

	double area() {
		System.out.println();
		return dim1 * dim2 / 2;
	}
}

class AbstractAccess {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		Figure f;
		f = r;
		System.out.println(f.area());
		f = t;
		System.out.println(f.area());
	}
}
/*
 * Output 45.0 40.0
 */
