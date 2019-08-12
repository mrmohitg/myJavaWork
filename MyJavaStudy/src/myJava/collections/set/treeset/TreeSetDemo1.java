package myJava.collections.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		System.out.println(treeSet.size());
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("B");
		treeSet.add("E");
		treeSet.add("D");
		System.out.println(treeSet);
		Iterator<String> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
