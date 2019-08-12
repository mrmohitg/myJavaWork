package myJava.collections.list.arrayList;

import java.util.ArrayList;



/**
 * @author Mohit
 * 
 * This program is used to add array list in  array list 
 */
public class ArrayListDemo4 {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<ArrayList> arrayList = new ArrayList<>();
		System.out.println(arrayList.size());
		
		arrayList.add(arrayList);
		arrayList.add(arrayList);
		
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		
	}
}
