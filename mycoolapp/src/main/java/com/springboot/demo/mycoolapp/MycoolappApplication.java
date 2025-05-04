package com.springboot.demo.mycoolapp;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.demo.mycoolapp.hibernate.dao.StudentDAO;
import com.springboot.demo.mycoolapp.hibernate.entity.Student;

//@SpringBootApplication(scanBasePackages = {"com.springboot.demo.mycoolapp","com.springboot.demo.util"})

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			System.out.println("Hibernate Setup");
			createStudent(studentDAO);
			createMultipleStudent(studentDAO);
			readStudent(studentDAO);
			queryForStudents(studentDAO);
			queryForStudentByFirstName(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {

		// create a student object
		System.out.println("Creating the new student object ...");
		Student tempStudent = new Student("Mohit", "Gupta", "mohitgupta@gmail.com");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id " + tempStudent.getId());

	}

	private void createMultipleStudent(StudentDAO studentDAO) {

		System.out.println("Creating the new student objects ...");
		Student tempStudent = new Student("Anurag", "Gupta", "anurag@gmail.com");
		studentDAO.save(tempStudent);

		System.out.println("Saved student. Generated id " + tempStudent.getId());
		Student tempStudent1 = new Student("Chhavi", "Gupta", "chhavi@gmail.com");
		studentDAO.save(tempStudent1);

		System.out.println("Saved student. Generated id " + tempStudent1.getId());
		Student tempStudent2 = new Student("Priyanka", "Gupta", "priyanka@gmail.com");
		studentDAO.save(tempStudent2);
		System.out.println("Saved student. Generated id " + tempStudent2.getId());

	}

	private void readStudent(StudentDAO studentDAO) {

		// create a student object
		System.out.println("Creating the new student object ...");
		Student tempStudent = new Student("Yashoraj", "Gupta", "yashorajgupta@gmail.com");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id " + tempStudent.getId());
		Student student = studentDAO.findById(tempStudent.getId());
		System.out.println(student.getFirstName() + " " + student.getLastName());
	}
	
	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		for(Student student : students) {
			System.out.println(student.getFirstName() + " " + student.getLastName() + "'s email id is "+ student.getEmail());
		}
	}
	
	private void queryForStudentByFirstName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByFirstName("Mohit");
		for(Student student : students) {
			System.out.println(student.getFirstName() + " " + student.getLastName() + "'s email id is "+ student.getEmail());
		}
	}

}
