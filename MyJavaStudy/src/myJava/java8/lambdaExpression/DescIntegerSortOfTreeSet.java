package myJava.java8.lambdaExpression;

import java.util.TreeSet;

public class DescIntegerSortOfTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> l = new TreeSet<Integer>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		l.add(10);
		l.add(30);
		l.add(50);
		l.add(0);
		l.add(60);
		l.add(40);
		l.add(20);
		System.out.println(l);

	}

}
