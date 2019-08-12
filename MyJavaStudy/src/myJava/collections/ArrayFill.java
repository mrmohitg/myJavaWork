package myJava.collections;

import java.util.Arrays;

public class ArrayFill {

	public static void main(String[] args) {
		double d[] = new double[5];
		Arrays.fill(d, 2.3);
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}

}
