package myJava.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBinarySearch {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("1");
		al.add("5");
		al.add("3");
		al.add("9");
		al.add("7");
		al.add("0");
		al.add("4");
		al.add("2");
		al.add("6");
		al.add("8");
		
		Collections.sort(al);
		System.out.println(al);
		
		int index = Collections.binarySearch(al, "6");
		System.out.println(index);
	}

}
