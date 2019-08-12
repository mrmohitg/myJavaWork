package myJava.collections;

import java.util.ArrayList;
import java.util.Collections;

public class MinMaxArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(34);
		al.add(new Integer("78"));
		al.add(new Integer(90));
		al.add(new Integer("65"));
		
		Object obj = Collections.max(al);
		Object obj1 = Collections.min(al);
		
		System.out.println(obj);
		System.out.println(obj1);
	}

}
