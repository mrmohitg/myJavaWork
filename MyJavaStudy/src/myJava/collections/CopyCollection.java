package myJava.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CopyCollection {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		System.out.println(al);
		ArrayList<String> v = new ArrayList<>();
		v.add("A");
		v.add("B");
		System.out.println(v);
		Collections.copy(al, v);
		System.out.println(al);
		
	}

}
