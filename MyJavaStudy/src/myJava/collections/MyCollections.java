package myJava.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyCollections {

	public static void main(String[] args) {

		List<String> al = Arrays.asList("Komal Girish Mahendra Amit Mahendra".split(" "));
		List<String> sublist = Arrays.asList("Vineet");
		List<String> searchList = Arrays.asList("Mahendra");
		System.out.println("Elements in list : "+al);
		
		Collections.copy(al, sublist);
		System.out.println("Elements in list : "+al);
		
		System.out.println("Object of max value : "+Collections.max(al));
		System.out.println("Object of min value : "+Collections.min(al));
		
		System.out.println("Find first index of Mahendra "+Collections.indexOfSubList(al, searchList));
		System.out.println("Find last index of Mahendra "+Collections.lastIndexOfSubList(al, searchList));
		
		System.out.println(Collections.replaceAll(al, "Girish", "Ranveer"));
		
		Collections.reverse(al);
		System.out.println(al);
		
		Collections.rotate(al, 4);
		System.out.println(al);
		
		System.out.println(al.size());
		
		Collections.swap(al, 0, al.size()-1);
		System.out.println(al);
		
		Collections.fill(al, "Yasho");
		System.out.println(al);
		
		List<String> raviList = Collections.nCopies(3, "Ravi");
		System.out.println(raviList);
		
		
	}

}
