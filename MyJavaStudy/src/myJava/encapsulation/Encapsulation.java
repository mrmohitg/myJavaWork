package myJava.encapsulation;

//Encapsulation example
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AreaOfRectangle {
	void area(double d, double c) {
		double jj;
		jj = d * c;
		System.out.println("The area of the rectangle is : " + jj);
	}
}

class Encapsulation {
	public static void main(String args[]) throws IOException {
		double n, m;
		System.out.println("Enter The Length & Breadth of Rectangle.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		n = Double.parseDouble(str);
		String str1 = br.readLine();
		m = Double.parseDouble(str1);
		AreaOfRectangle a = new AreaOfRectangle();
		a.area(n, m);
	}
}
/*
 * Output Enter The Length & Breadth of Rectangle. 12 23 The area of the
 * rectangle is : 276.0
 */