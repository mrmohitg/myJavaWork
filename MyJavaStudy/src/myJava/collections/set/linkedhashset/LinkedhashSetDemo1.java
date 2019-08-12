package myJava.collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedhashSetDemo1 {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedhashSet = new LinkedHashSet<>();
		System.out.println(linkedhashSet.size());
		linkedhashSet.add("A");
		linkedhashSet.add("B");
		linkedhashSet.add("C");
		
		System.out.println(linkedhashSet.add("A"));
		System.out.println(linkedhashSet.size());
		System.out.println(linkedhashSet);
	}

}
