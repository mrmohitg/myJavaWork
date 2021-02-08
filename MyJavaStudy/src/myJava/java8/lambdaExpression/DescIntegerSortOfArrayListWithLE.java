package myJava.java8.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescIntegerSortOfArrayListWithLE {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(30);
		l.add(50);
		l.add(0);
		l.add(60);
		l.add(40);
		l.add(20);
		Collections.sort(l, (I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? +1 : 0);
		System.out.println(l);
	}
}
