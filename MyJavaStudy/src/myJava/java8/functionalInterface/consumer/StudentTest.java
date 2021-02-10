package myJava.java8.functionalInterface.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> listOfStudent = new ArrayList<Student>();
		populateStudent(listOfStudent);

		Predicate<Student> p = S -> S.marks >= 60;
		Function<Student, String> f = S -> {
			int m = S.marks;
			if (m >= 80)
				return "A";
			else if (m >= 60)
				return "B";
			else if (m >= 40)
				return "C";
			else if (m >= 33)
				return "D";
			else
				return "E";
		};

		Consumer<Student> c = S -> {
			System.out.println("Name " + S.name);
			System.out.println("Marks " + S.marks);
			System.out.println("Grade " + f.apply(S));
		};

		for (Student s : listOfStudent) {
			if (p.test(s))
				c.accept(s);
		}

	}

	public static void populateStudent(List<Student> l) {
		l.add(new Student("Mohit", 99));
		l.add(new Student("Anurag", 77));
		l.add(new Student("Arnav", 34));
		l.add(new Student("Nishant", 88));
		l.add(new Student("Vipul", 55));
		l.add(new Student("Nikhil", 12));
	}

}
