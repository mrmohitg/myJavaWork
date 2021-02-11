package myJava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodsOfStreams {

	public static void main(String[] args) {

		List<Integer> listOfInteger = new ArrayList<>();
		listOfInteger.add(0);
		listOfInteger.add(39);
		listOfInteger.add(46);
		listOfInteger.add(63);
		listOfInteger.add(89);
		listOfInteger.add(53);
		listOfInteger.add(21);
		listOfInteger.add(94);

		//collect()
		List<Integer> listOfInteger1 = listOfInteger.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println(listOfInteger1);
		
		//count()
		long listOfInteger2 = listOfInteger.stream().filter(I -> I % 2 != 0).count();
		System.out.println(listOfInteger2);
		
		//sort()
		List<Integer> listOfInteger3 = listOfInteger.stream().sorted().collect(Collectors.toList());
		System.out.println(listOfInteger3);
		
		//sort(Comparator)
		List<Integer> listOfInteger4 = listOfInteger.stream().sorted((I,J)->(I>J?-1:(I<J?1:0))).collect(Collectors.toList());
		System.out.println(listOfInteger4);
		
		//min()
		Integer minValue = listOfInteger.stream().min((i,j)-> i.compareTo(j)).get();
		System.out.println(minValue);
		
		//min()
		Integer maxValue = listOfInteger.stream().max((i,j)-> i.compareTo(j)).get();
		System.out.println(maxValue);
		
		//forEach()
		listOfInteger.stream().forEach(S -> System.out.println(S));
		listOfInteger.stream().forEach(System.out::println);
		
		//toArray()
		Integer[] inte = listOfInteger.stream().toArray(Integer[]::new);
		for(Integer i : inte)
			System.out.print(i+" ");
		
		//streamOf
		Double d[] = {10.0,11.0,12.0,13.0};
		Stream stream = Stream.of(d);
		Stream<Integer> stream1 = Stream.of(9,99,999);
		
	}

}
