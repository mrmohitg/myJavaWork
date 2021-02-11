package myJava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {

		List<Integer> listOfInteger = new ArrayList<>();
		listOfInteger.add(0);
		listOfInteger.add(39);
		listOfInteger.add(46);
		listOfInteger.add(23);
		listOfInteger.add(89);
		listOfInteger.add(43);
		listOfInteger.add(21);
		listOfInteger.add(44);

		List<Integer> listOfInteger1 = listOfInteger.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println(listOfInteger1);
		
		List<Integer> listOfInteger2 = listOfInteger.stream().map(I -> I*I).collect(Collectors.toList());
		System.out.println(listOfInteger2);
	}

}
