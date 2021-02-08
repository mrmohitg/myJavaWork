package myJava.java8.lambdaExpression;

import java.util.TreeMap;

public class DescSortOfTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> l = new TreeMap<Integer, String>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		l.put(10, "Mohit");
		l.put(0, "Soft");
		l.put(0, "Anurag");
		l.put(20, "Arnav");
		l.put(40, "Khushi");

		System.out.println(l);

	}

}
