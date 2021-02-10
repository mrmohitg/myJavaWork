package myJava.java8.functionalInterface.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class TeacherTest {

	public static void main(String[] args) {

		List<Teacher> listOfTeacher = new ArrayList<Teacher>();
		BiFunction<String,Integer,Teacher> bif = (S,I) -> {
		
			Teacher t = new Teacher(S,I);
			listOfTeacher.add(t);
			System.out.println(t);
			return t;
		};
		bif.apply("Mohit", 10);
		
		for(Teacher t : listOfTeacher)
		{
			System.out.println(t.name);
		}
	}

}
