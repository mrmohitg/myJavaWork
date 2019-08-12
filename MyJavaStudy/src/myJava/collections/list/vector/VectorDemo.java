package myJava.collections.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author Mohit
 * 
 * This program is used to add string to vector and retrieve the objects via enumeration and itrator. 
 */
public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>(3,2);
		System.out.println("Initial Capacity "+vector.capacity());
		System.out.println("Number of elements "+vector.size());
		vector.add("A");
		vector.add("B");
		vector.add("C");
		vector.add("D");
		System.out.println("Initial Capacity "+vector.capacity());
		System.out.println("Number of elements "+vector.size());
		vector.removeElementAt(2);
		
		Enumeration<String> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			System.out.println(string);
		}
		
		Iterator<String> iterator = vector.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
