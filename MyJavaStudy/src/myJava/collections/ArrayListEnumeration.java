package myJava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class ArrayListEnumeration {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		Enumeration<String> e = Collections.enumeration(al);
		while (e.hasMoreElements()) {
			String string = (String) e.nextElement();
			System.out.println(string);
		}
	}
}
