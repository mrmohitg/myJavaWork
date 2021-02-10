package myJava.java8.functionalInterface.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentTest {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();
		populateStudent(studentList);

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

		for (Student student : studentList) {
			System.out.println("Student Name " + student.name);
			System.out.println("Student Marks " + student.marks);
			System.out.println("Student Grade " + f.apply(student));
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
