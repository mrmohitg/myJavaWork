package hibernate.tutorial;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.tutorial.dto.Address;
import hibernate.tutorial.dto.Designation;
import hibernate.tutorial.dto.Skills;
import hibernate.tutorial.dto.UserDetails;

public class UserTest {

	public static void main(String[] args) {

		UserDetails ud = new UserDetails();
		ud.setUserName("Mrs Prerna");
		//ud.setAddress("New Mumbai");
		Address add1 = new Address();
		add1.setStreet("Goregaon");
		add1.setCity("New Mumbai");
		add1.setState("Maharashtra");
		add1.setPincode(509123);
		
		Address add11 = new Address();
		add11.setStreet("Borewali");
		add11.setCity("New Mumbai");
		add11.setState("Maharashtra");
		add11.setPincode(509124);
		
		Skills skill1 = new Skills();
		skill1.setPrimarySkills("Java");
		Skills skill2 = new Skills();
		skill2.setPrimarySkills("JEE");
		
		ud.getSetOfskills().add(skill1);
		ud.getSetOfskills().add(skill2);
		
		Designation des1 = new Designation();
		des1.setDesignationName("Actress");
		ud.getSetOfDesignation().add(des1);
		
		ud.setHomeAddress(add1);
		ud.setOfficeAddress(add11);
		ud.setJoiningDate(new Date());
		ud.setDescription("Actor");
		//ud.setSetOfskills(setOfSkills);
		
		UserDetails ud1 = new UserDetails();
		ud1.setUserName("Mr Bajaj");
		//ud1.setAddress("New Delhi");
		Address add2 = new Address();
		add2.setStreet("Gurgaon");
		add2.setCity("New Delhi");
		add2.setState("Delhi");
		add2.setPincode(110034);
		
		Address add22 = new Address();
		add22.setStreet("Noida");
		add22.setCity("New Delhi");
		add22.setState("Delhi");
		add22.setPincode(201301);
		
		Designation des11 = new Designation();
		des11.setDesignationName("Actor");
		ud1.getSetOfDesignation().add(des11);
		
		ud1.setHomeAddress(add2);
		ud1.setOfficeAddress(add22);
		ud1.setJoiningDate(new Date());
		ud1.setDescription("Actor");
		//ud1.setSetOfskills(setOfSkills);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(ud);
		session.save(ud1);
		session.getTransaction().commit();
		session.close();
		System.out.println("connection closed");
		
		/*ud = null;
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		ud =(UserDetails) session2.get(UserDetails.class, 1);
		System.out.println("First User is " + ud.getUserName());
		session2.save(ud);
		session2.getTransaction().commit();
		session2.close();*/
	}
}
