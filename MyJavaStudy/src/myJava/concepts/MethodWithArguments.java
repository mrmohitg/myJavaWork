package myJava.concepts;

//Method with number of arguments 
class RectangleArea {
	int h, w;

	int Area(int x, int y) {
		h = x;
		w = y;
		return h * w;
	}
}

public class MethodWithArguments {
	public static void main(String args[]) {
		RectangleArea obj = new RectangleArea();
		int area = obj.Area(10, 20);
		System.out.println("The area of the rectangle is " + area);
	}
}
/*
 * Output The area of the rectangle is 200
 */