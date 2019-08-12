package myJava.collections.list.arrayList;

import java.util.ArrayList;



/**
 * @author Mohit
 * 
 * This program is used to add array list of string in to another array list. 
 */
public class ArrayListDemo5 {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<ArrayList> arrayList = new ArrayList<>();
		ArrayList<String> arrayListString = new ArrayList<>();
		System.out.println(arrayList.size());
		System.out.println(arrayListString.size());
		
		arrayListString.add("Mohit");
		arrayListString.add("Anurag");
		
		arrayList.add(arrayListString);
		arrayList.add(arrayListString);
		
		System.out.println(arrayList.size());
		System.out.println(arrayListString.size());
		System.out.println(arrayList);
		
	}
}
