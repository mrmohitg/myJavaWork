package myJava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<String> stuff = new ArrayList<>();
		stuff.add("A");
		stuff.add("B");
		stuff.add("A");
		stuff.add("C");
		stuff.add("T");
		stuff.add("D");
		System.out.println(stuff);
		Collections.sort(stuff);
		System.out.println(stuff);
		
		
		
		
		String strings[] = {"A","Z","Y","D","J","S"};
		Arrays.sort(strings);
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
	}

}
