package myJava.java8.functionalInterface.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MovieTest {

	public static void main(String[] args) {
		
		List<Movie> listOfMovies = new ArrayList<Movie>();
		populateMovie(listOfMovies);
		
		Consumer<Movie> c = M -> System.out.println(M);
		
		for(Movie m : listOfMovies)
			c.accept(m);
		
	}

	public static void populateMovie(List<Movie> list)
	{
		list.add(new Movie("Happy New Year","Shah Rukh","Deepika"));
		list.add(new Movie("Jab Tak Hai Jaan","Shah Rukh","Katrina"));
		list.add(new Movie("Raees","Shah Rukh","Sunny"));
		list.add(new Movie("Don","Shah Rukh","Priyanka"));
		list.add(new Movie("Dear Zindagi","Shah Rukh","Alia"));
		list.add(new Movie("Jab Harry Met Sejal","Shah Rukh","Anushka"));
		list.add(new Movie("Dilwale","Shah Rukh","Kajol"));
		list.add(new Movie("Kabhi Alvida Naa Kehna","Shah Rukh","Rani"));
		list.add(new Movie("Kal Ho Naa Ho","Shah Rukh","Preeti"));
		
	}
}
