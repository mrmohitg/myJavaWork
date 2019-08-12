package myJava.collections.set.hashset;

import java.util.HashSet;


/**
 * @author Mohit
 *
 *This program demonstrate the hash set class
 */
public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		System.out.println(hashSet.size());
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		
		System.out.println(hashSet.add("A"));
		System.out.println(hashSet.size());
		System.out.println(hashSet);
	}
}
