package myJava.java8.functionalInterface.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Movies {
	String name;
	String result;
	int earning;

	public Movies(String name, String result, int earning) {
		super();
		this.name = name;
		this.result = result;
		this.earning = earning;
	}

}

public class ConsumerChaining {

	public static void main(String[] args) {
		List<Movies> listOfMovies = new ArrayList<Movies>();
		populateMovies(listOfMovies);
		Consumer<Movies> c1 = M -> {
			System.out.println("Movie " + M.name + " is ready to release.");
		};
		Consumer<Movies> c2 = M -> {
			System.out.println("Movie " + M.name + " is " + M.result + ".");
		};
		Consumer<Movies> c3 = M -> {
			System.out.println("Movie " + M.name + " has earned " + M.earning);
		};
		for (Movies m : listOfMovies)
			c1.andThen(c2).andThen(c3).accept(m);

	}

	public static void populateMovies(List<Movies> list) {
		list.add(new Movies("Happy New Year", "Flop", 34563));
		list.add(new Movies("Jab Tak Hai Jaan", "Hit", 67858));
		list.add(new Movies("Raees", "Hit", 56885));
		list.add(new Movies("Don", "Hit", 245553));
		list.add(new Movies("Dear Zindagi", "Flop", 34543));
		list.add(new Movies("Jab Harry Met Sejal", "Flop", 2345));
		list.add(new Movies("Dilwale", "Hit", 325523));
		list.add(new Movies("Kabhi Alvida Naa Kehna", "Hit", 23455));
		list.add(new Movies("Kal Ho Naa Ho", "Hit", 23455));

	}

}
